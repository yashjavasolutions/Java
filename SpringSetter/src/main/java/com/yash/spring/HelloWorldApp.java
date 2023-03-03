package com.yash.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		/*HelloWorldImpl2 helloWorld = new HelloWorldImpl2();
		helloWorld.setMessage("Hello USA");*/
		helloWorld.display();
		

	}

}
