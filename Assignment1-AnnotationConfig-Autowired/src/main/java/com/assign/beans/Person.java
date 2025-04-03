package com.assign.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	@Autowired
	private Vehicle vehicleOwned;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle getVehicleOwned() {
		return vehicleOwned;
	}

	public void setVehicleOwned(Vehicle vehicleOwned) {
		this.vehicleOwned = vehicleOwned;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", vehicleOwned=" + vehicleOwned + "]";
	}
	
	
}
