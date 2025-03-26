package com.fmc.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Vehicle {

	private String name;
	private String model;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + "]";
	}

	@PostConstruct
	public void intialize() {
		System.out.println("From Post construct");
		this.name = "Ferrari";
		this.model = "C01";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Object Destroyed");
	}
	
}
