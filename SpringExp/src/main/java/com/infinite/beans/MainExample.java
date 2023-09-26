package com.infinite.beans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// this class is used for testing purpose
public class MainExample {
	public static void main(String[] arg) {

		AbstractApplicationContext context =

				new ClassPathXmlApplicationContext("Sample.xml");

		Address customer = (Address) context.getBean("custAddress1");
System.out.println(customer.getCity());
System.out.println(customer.getDoorNo());
context.registerShutdownHook();
	}
}
