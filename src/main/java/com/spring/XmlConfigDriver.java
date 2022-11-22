package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		Employee emp2 = (Employee) context.getBean("emp2");
		System.out.println(emp2);

	}

}
