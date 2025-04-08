package com.carsim.impl;

import org.springframework.stereotype.Component;

import com.carsim.interfaces.Tyre;

@Component
public class BridgeStoneTyres implements Tyre{

	private String tyreName = "BridgeStone";
	@Override
	public void rotate() {
		System.out.println(tyreName+" tyres are running...");
		
	}

}
