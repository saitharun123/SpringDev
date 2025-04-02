package com.bmt.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.bmt.interfaces.TransportMode;

@Component
@Primary
public class Bus implements TransportMode{

	
	@Override
	public String toString() {
		return "Bus";
	}

	@Override
	public void startTransport() {
	System.out.println("Bus started...");
		
	}

	@Override
	public void stopTransport() {
		System.out.println("Bus is stopping...");
		
	}

	@Override
	public double calculateFare(int distance) {
		double fare = distance * 5;
		return fare;
	}

}
