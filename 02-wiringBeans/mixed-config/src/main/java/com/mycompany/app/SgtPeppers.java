package com.mycompany.app;

//import org.springframework.stereotype.Component;
//import javax.inject.Named;

//@Component("lonelyHeartsClub")
//the string is the components id
//@Named("lonelyHeartsClub")
//@Named can be used as alternative to @Component
//part of JSR-330, in order to make functional: a) uncomment 'Named' import. b) uncomment 'apache.geronimo' dependency in pom.xml
//Spring in Action, 4th ed : Spring supports the @Named annotation as an alternative to @Component. There are a few subtle differences, but in most cases
//	they are interchangable.
public class SgtPeppers implements CompactDisc{
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	public void play(){
		System.out.print("Playing " + title + " by " + artist);
	}
}