package com.infinite.beans;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main1 {
	public static void main(String[] arg) {
		
	AbstractApplicationContext context =
			new ClassPathXmlApplicationContext("New.xml");

	DateCity customer = (DateCity) context.getBean("datecity");
	System.out.println(customer.getDate());
	System.out.println(customer.getName());
	System.out.println(customer.getCity());
	context.registerShutdownHook();
}
}