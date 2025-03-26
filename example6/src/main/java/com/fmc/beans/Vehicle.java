package com.fmc.beans;

import org.springframework.stereotype.Component;

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


}
