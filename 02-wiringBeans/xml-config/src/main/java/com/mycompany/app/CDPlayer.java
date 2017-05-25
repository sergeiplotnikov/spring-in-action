package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

//import javax.inject.Inject;
//import javax.inject.Named;
//another JSR-330 example is SgtPeppers.java file

//@Component
//@Named
//A JSR-330 alternative annotation
public class CDPlayer implements MediaPlayer{
	private CompactDisc cd;
	private MetalMusicCD metalCD;
	
	//@Autowired
	//@Inject
	//A JSR-330 alternative annotation
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	public void play(){
		cd.play();
	}
	
	public void playMetal(){
		metalCD.play();
	}
	
	@Autowired(required=false)
	//unless 'required' set to 'false' the MAVEN PACKAGE goal will fail test. Since there is no bean that implements MetalMusicCD
	public void putInMetalMusicCD(MetalMusicCD metal){
		this.metalCD = metal;
	}
}