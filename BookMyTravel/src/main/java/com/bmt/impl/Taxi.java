package com.bmt.impl;

import org.springframework.stereotype.Component;

import com.bmt.interfaces.TransportMode;

@Component
public class Taxi implements TransportMode{

	
	@Override
	public String toString() {
		return "Taxi";
	}

	@Override
	public void startTransport() {
		System.out.println("Taxi has started....");
		
	}

	@Override
	public void stopTransport() {
		System.out.println("Taxi stopped...");
	}

	@Override
	public double calculateFare(int distance) {
		double fare = distance * 20;
		return fare;
	}

}
