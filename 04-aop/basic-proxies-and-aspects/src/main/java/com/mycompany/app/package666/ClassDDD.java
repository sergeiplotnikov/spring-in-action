package com.mycompany.app.package666;

public class ClassDDD implements com.mycompany.app.InterfaceY{
	private boolean firstTimeDoingY = true;
	public void doY(){
		System.out.println("Object of class DDD is 'doingY'\n");
		if(firstTimeDoingY){
			this.firstTimeDoingY = false;
			System.out.println("will repeat last operation...");
			this.doY();
		}
	}
	public void doXY(){
		System.out.println("Object of class DDD is 'doing-XY'\n");
	}
}
