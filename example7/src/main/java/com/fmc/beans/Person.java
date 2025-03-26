package com.fmc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name = "Sai Tharun";
	
	//@Autowired //--> field injection
	private Vehicle vehicle;
	
	@Autowired  //--> constructor injection
	public Person(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	
	//@Autowired //--> setter based injection
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", vehicle=" + vehicle + "]";
	}
	
	
}
