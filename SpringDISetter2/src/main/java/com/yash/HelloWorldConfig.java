package com.yash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

	@Bean (name ="helloWorld")
	public HelloWorld2 gethelloWorld() {
	//	HelloWorld2 h1 = new HelloWorld2();
	//	h1.setMessage("Hello World");
		//h1.setMessage2("Hello USA");
		return new HelloWorld2();
	}
	
}
