package com.mycompany.components;

import org.springframework.stereotype.Component;
import com.mycompany.app.MetalMusicCD;

@Component("incurso")
public class Incurso implements MetalMusicCD{
	private String title = "Incurso";
	private String artist = "Spawn Of Possession";
	
	public void play(){
		System.out.print("Playing " + title + " by " + artist);
	}
}