package com.bmt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bmt.interfaces.TransportMode;

@Component
public class BookMyTravel {

	@Autowired
	private TransportMode transportMode;
	

	public TransportMode getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(TransportMode transportMode) {
		this.transportMode = transportMode;
	}
	
	
	@Override
	public String toString() {
		return "BookMyTravel [transportMode=" + transportMode + "]";
	}

	public void start() {
		transportMode.startTransport();
	}
	
	public void stop() {
		transportMode.stopTransport();
	}
	
	public double calculatingFare(int distance) {
		double fare = transportMode.calculateFare(distance);
		return fare;
	}

}
