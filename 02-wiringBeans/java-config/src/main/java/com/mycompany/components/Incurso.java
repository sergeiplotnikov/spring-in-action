package com.mycompany.components;

import org.springframework.stereotype.Component;
import com.mycompany.app.CompactDisc;

@Component("incurso")
public class Incurso implements CompactDisc{
	private String title = "Incurso";
	private String artist = "SpawnOfPossession";
	
	public void play(){
		System.out.println("Playing " + title + " by " + artist);
	}
}