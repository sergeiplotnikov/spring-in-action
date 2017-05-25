package com.mycompany.app;

import java.util.List;

public class RealBlankDisc implements CompactDisc{
	
	private String title;
	private String artist;
	private List<String> tracks;
	
	public RealBlankDisc(){}
	
	public RealBlankDisc(String title, String artist, List<String> tracks){
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public void play(){
		System.out.print("Playing " + title + " by " + artist);
		for(String track : tracks)
			System.out.println("-Track: " + track);
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setArtist(String artist){
		this.artist = artist;
	}
	
	public void setTracks(List<String> tracks){
		this.tracks = tracks;
	}
	
}