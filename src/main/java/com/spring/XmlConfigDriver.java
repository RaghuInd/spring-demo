package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotations.Book;

public class XmlConfigDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		Employee emp2 = (Employee) context.getBean("emp2");
		System.out.println(emp2);
		Book book = (Book) context.getBean("book");
		System.out.println(book);

	}

}
