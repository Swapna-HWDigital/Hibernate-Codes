package com.hexaware.springhelloworldapp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexaware.springhelloworldapp.services.SpringHelloWorld;

public class HelloTest {

	 
		@SuppressWarnings("resource")
		public static void main(String[] args) {
	 
			// loading the definitions from the given XML file
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
	 
			SpringHelloWorld service = (SpringHelloWorld) context
					.getBean("helloWorldService");
			String message = service.sayHello();
			System.out.println(message);
	 
			//set a new name
			service.setName("Spring");
			message = service.sayHello();
			System.out.println(message);
		}
	}

