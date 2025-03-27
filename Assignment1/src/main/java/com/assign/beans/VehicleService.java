package com.assign.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.assign.interfaces.Speakers;
import com.assign.interfaces.Tyres;

@Component("vehicleService")
public class VehicleService {

	@Autowired
	@Qualifier("BoseSpeaker")
	private Speakers speaker;
	
	
	private Tyres tyres;


	public Speakers getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speakers speaker) {
		this.speaker = speaker;
	}

	public Tyres getTyres() {
		return tyres;
	}

	@Autowired
	@Qualifier("MichellinTyres")
	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}

	@Override
	public String toString() {
		return "VehicleService [speaker=" + speaker + ", tyres=" + tyres + "]";
	}
	
	
}
