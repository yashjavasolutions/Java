package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(HelloWorldConfig.class);
		context.refresh();
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.display();
	}

}
