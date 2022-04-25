package com.hexaware.springhelloworldapp.services;

import org.springframework.stereotype.Service;
 
@Service("helloWorldService")
public class SpringHelloWorld {
 
	private String name;
 
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello! " + name;
	}
}
