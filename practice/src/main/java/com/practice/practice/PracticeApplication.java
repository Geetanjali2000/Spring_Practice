package com.practice.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeApplication {

	public static void main(String[] args) {
		// SpringApplication.run(PracticeApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/practice/src/main/java/applicationContext.xml");
		Employee emp = (Employee) context.getBean("e");
		emp.toString();
	}

}
