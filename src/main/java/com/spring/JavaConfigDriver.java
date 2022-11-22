package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDriver {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		Employee emp = (Employee)context.getBean("employee");
		System.out.println(emp);

	}

}
