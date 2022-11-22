package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("author")
public class Author {
	@Value("10")
	private Integer id;
	@Value("Spring.io")
	private String name;
	
	public Author() {
		super();
	}

	public Author(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
	

}
