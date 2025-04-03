package com.assign.beans;

public class Vehicle {

	private String vehicleName;
	private String modelNo;
	private VehicleService service;

	
	public String getVehicleName() {
		return vehicleName;
	}
	
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public VehicleService getService() {
		return service;
	}

	public void setService(VehicleService service) {
		this.service = service;
	}


	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", modelNo=" + modelNo + "]";
	}

	
	public void playMusic() {
	
		service.getSpeaker().makeSound();
	}
	
	public void move() {
		service.getTyres().rotate();
	}
}
