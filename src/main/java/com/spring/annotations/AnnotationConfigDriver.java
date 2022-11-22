package com.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation-beans.xml");
		Book book = (Book) context.getBean("book");
		System.out.println(book);

	}

}
