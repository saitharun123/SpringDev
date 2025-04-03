package com.assign.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.assign.interfaces.Tyres;

@Component
@Primary
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
