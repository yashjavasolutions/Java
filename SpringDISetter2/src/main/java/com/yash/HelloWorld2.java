package com.yash;

import org.springframework.beans.factory.annotation.Value;

public class HelloWorld2 implements HelloWorld {
	@Value("Hello World")
	private String message ;
	
	@Value("Hello USA")
	private String message2;


	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getMessage2() {
		return message2;
	}


	public void setMessage2(String message2) {
		this.message2 = message2;
	}



	public void display()
	{
		System.out.println(message);
		System.out.println(message2);
	}
}
