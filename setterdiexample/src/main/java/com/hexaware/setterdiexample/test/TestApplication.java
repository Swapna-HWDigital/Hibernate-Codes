package com.hexaware.setterdiexample.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.setterdiexample.config.AppConfiguration;
import com.hexaware.setterdiexample.setter.SetterBasedInjection;


public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		//FieldBasedInjection  fieldBasedInjection = applicationContext.getBean(FieldBasedInjection.class);
		//fieldBasedInjection.processMsg("twitter message sending ");
		SetterBasedInjection setterBasedInjection = applicationContext.getBean(SetterBasedInjection.class);
		setterBasedInjection.processMsg("twitter message sending ");
	}
}
