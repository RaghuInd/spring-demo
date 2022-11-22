package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {

	
	@Bean//("beanName") 
	public Address address() {
		
		return new Address(22, "Delhi");
		
	}
	
	@Bean//("beanName") 
	public Employee employee() {
		
		return new Employee(555, "Java bean", 10000.0,address());
	}
	
	
}
