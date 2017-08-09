package com.mycompany.app.package123;

public class ClassCCC implements com.mycompany.app.InterfaceY{
	private boolean firstTimeDoingY = true;
	public void doY(){
		System.out.println("Object of class CCC is 'doingY'\n");
		if(firstTimeDoingY){
			this.firstTimeDoingY = false;
			System.out.println("will repeat last operation...");
			this.doY();
		}
	}
	public void doXY(){}

}
