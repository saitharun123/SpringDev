package com.carsim.impl;

import org.springframework.stereotype.Component;

import com.carsim.interfaces.Tyre;

@Component("MrfTyres")
public class MRFTyres implements Tyre {

	private String tyreName = "MRF";
	@Override
	public void rotate() {
		System.out.println(tyreName+" tyres are running...");
	}

}
