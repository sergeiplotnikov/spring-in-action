package com.mycompany.app;

public class ClassAAA implements InterfaceX{
	private boolean firstTimeDoingX = true;
	public void doX(){
		System.out.println("Object of class AAA is 'doingX'\n");
		if(firstTimeDoingX){
			this.firstTimeDoingX = false;
			System.out.println("will repeat last operation...");
			this.doX();
		}
	}
	public void doXY(){
		System.out.println("Object of class AAA is 'doing-XY'");
	}
}
