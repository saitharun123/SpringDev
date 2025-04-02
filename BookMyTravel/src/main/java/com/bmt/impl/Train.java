package com.bmt.impl;

import org.springframework.stereotype.Component;

import com.bmt.interfaces.TransportMode;

@Component
public class Train implements TransportMode{

	
	@Override
	public String toString() {
		return "Train";
	}

	@Override
	public void startTransport() {
		System.out.println("Train started...");
		
	}

	@Override
	public void stopTransport() {
		System.out.println("Train Stopped...");
		
	}

	@Override
	public double calculateFare(int distance) {
		double fare = distance * 3;
		return fare;
	}

}
