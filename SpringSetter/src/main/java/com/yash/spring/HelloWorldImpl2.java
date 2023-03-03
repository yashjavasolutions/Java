package com.yash.spring;

public class HelloWorldImpl2 implements HelloWorld{

	

	private String message;
	

	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}


	public void display() {
	 System.out.println("This is an alternative implementation. Also the message is "+ message );
		
	}

}
