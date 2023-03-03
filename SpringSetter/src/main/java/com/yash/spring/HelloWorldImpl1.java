package com.yash.spring;

public class HelloWorldImpl1  implements HelloWorld{
	
	private String message;
	
	
	

	public HelloWorldImpl1(String message) {
		
		this.message = message;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public void display() {
		System.out.println(message);
		
	}

}
