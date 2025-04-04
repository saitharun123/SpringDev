package com.assign.impl;

import org.springframework.stereotype.Component;

import com.assign.interfaces.Tyres;

@Component("MichellinTyres")
public class MichellinTyres implements Tyres {

	private final String tyresName = "Michellin Tyres";
	
	
	public String getTyresName() {
		return tyresName;
	}
	
	@Override
	public String toString() {
		return tyresName ;
	}
	
	@Override
	public String rotate() {
		// TODO Auto-generated method stub
		return "Vehicle moving on "+tyresName;
	}


	@Override
	public String stop() {
		
		return "Vehicle stopped with "+tyresName;
	}
}
