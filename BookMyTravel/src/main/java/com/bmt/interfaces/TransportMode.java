package com.bmt.interfaces;

public interface TransportMode {

	void startTransport();
	void stopTransport();
	double calculateFare(int distance);
}
