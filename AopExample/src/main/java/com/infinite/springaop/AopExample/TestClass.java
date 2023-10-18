package com.infinite.springaop.AopExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] arg) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		// Get BusinessLogic bean object from ApplicationContext instance.
		CommonClass businessLogic = (CommonClass) context.getBean("businessLogic");

		// Call implementBusinessLogic method of BusinessLogic bean.
		businessLogic.display();
	}
}