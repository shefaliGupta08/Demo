package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
ApplicationContext appcon = new ClassPathXmlApplicationContext("web.xml");
Student factory = (Student) appcon.getBean("studentbean");
factory.displayInfo();
		
	}

}
