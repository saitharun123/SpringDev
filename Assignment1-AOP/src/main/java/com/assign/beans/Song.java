package com.assign.beans;

import org.springframework.stereotype.Component;

@Component
public class Song {

	private String songName;
	private String artistName;
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	@Override
	public String toString() {
		return "Song [songName=" + songName + ", artistName=" + artistName + "]";
	}
	
	
}
