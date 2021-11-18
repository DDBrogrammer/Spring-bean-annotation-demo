package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp { 

	public static void main(String[] args) {
	// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
	// retrieve bean from container  
		
		Coach theCoach= context.getBean("tennisCoach",Coach.class);
		
		Coach theACoach= context.getBean("tennisCoach",Coach.class);
		
		// check 
		boolean result =(theACoach==theCoach);
		System.out.println(result);
		System.out.println(theACoach);
		System.out.println(theCoach);
		
		context.close();
		

	}

}
