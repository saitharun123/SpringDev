package com.fmc.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	private String name = "TATA";
	private String model = "Nexon EV";
	

	public Vehicle() {
		super();
	}
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


}
