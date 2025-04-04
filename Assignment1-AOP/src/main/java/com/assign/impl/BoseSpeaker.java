package com.assign.impl;

import org.springframework.stereotype.Component;

import com.assign.beans.Song;
import com.assign.interfaces.Speakers;


@Component("BoseSpeaker")
public class BoseSpeaker implements Speakers{

	private final String speakerName = "Bose";
	@Override
	public String makeSound(Song song) {
		return "Playing "+song.getSongName()+"by "+song.getArtistName()+" with "+speakerName;
	}
	
	public String getSpeakerName() {
		return speakerName;
	}

	@Override
	public String toString() {
		return speakerName;
	}
	

}
