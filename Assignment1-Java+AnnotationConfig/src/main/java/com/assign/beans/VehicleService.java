package com.assign.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.assign.interfaces.Speakers;
import com.assign.interfaces.Tyres;

@Component
public class VehicleService {

	@Autowired
	private Speakers speaker;
	@Autowired
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

	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}

	@Override
	public String toString() {
		return "VehicleService [speaker=" + speaker + ", tyres=" + tyres + "]";
	}
	
	
}
