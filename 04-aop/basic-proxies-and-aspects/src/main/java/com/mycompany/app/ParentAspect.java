package com.mycompany.app;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.annotation.Around;


@Aspect
public class ParentAspect{
	
	/* ************* Pointcuts ************* */
	@Pointcut ("execution(* com.mycompany.app.InterfaceX.doX(..))")
	public void someoneDoesX(){}

	@Pointcut ("execution(* com.mycompany.app.InterfaceY.doY(..))")
	public void someoneDoesY(){}
	
	@Pointcut ("within(com.mycompany.app.package123..*)")
	public void insidePackage123(){}

	@Pointcut ("within(com.mycompany.app.package666..*)")
	private void insidePackage666(){}




	/* ************* Advices ************* */
	@Before ("someoneDoesX() && !insidePackage123()")
	public void beforeXadvice(){
		System.out.println(":::::ParentAspect:::::: a before-someone-does-X advice was triggered :::::");
	}

	@Before ("someoneDoesY() && !insidePackage123()")
	public void beforeYadvice(){
		System.out.println(":::::ParentAspect:::::: a before-someone-does-Y advice was triggered :::::");
	}
}
