package com.spring;

public class Address {

	Integer dooorNumber;


	String city;
	public Address() {
		super();
	}
	public Address(Integer dooorNumber, String city) {
		super();
		this.dooorNumber = dooorNumber;
		this.city = city;
	}
	public Integer getDooorNumber() {
		return dooorNumber;
	}
	public void setDooorNumber(Integer dooorNumber) {
		this.dooorNumber = dooorNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [dooorNumber=" + dooorNumber + ", city=" + city + "]";
	}	
	
}
