package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book")
public class Book {

	@Value("100")
	private Integer id;
	@Value("Spring Introduction.")
	private String name;
	@Value("345.0")
	private Double price;
	
	//@Autowired
	private Author author;// filed injection
	
	public Book() {
		super();
	}
	
	
	public Book(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	//@Autowired
	public Book(Author author) {
		super();
		//author.setName("GL India");
		this.author = author;
		System.out.println("Autowird by constructor.");
	}


	public Author getAuthor() {
		return author;
	}

	@Autowired
	public void setAuthor(Author author) { // setter injection
		System.out.println("Setter injection");
		this.author = author;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}

	
}
