package com.assign.impl;

import com.assign.interfaces.Tyres;

public class BridgeStoneTyres implements Tyres{

	private final String tyresName = "BridgeStone";
	
	public String getTyresName() {
		return tyresName;
	}
	
	
	@Override
	public String toString() {
		return tyresName ;
	}


	@Override
	public void rotate() {

			System.out.println("Running on "+tyresName+" Tyres...");
		
	}

}
