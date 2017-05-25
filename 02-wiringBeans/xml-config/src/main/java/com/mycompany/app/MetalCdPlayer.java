package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

public class MetalCdPlayer{
	
	private BlankDisc metalCD;
	
	public void play(){
		metalCD.play();
	}
	
	public void setMetalCD(BlankDisc metal){
		this.metalCD = metal;
	}
}