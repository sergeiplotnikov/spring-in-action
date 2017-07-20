package com.mycompany.app;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.annotation.Around;


@Aspect
public class Audience{
	
	@Pointcut ("execution(* com.mycompany.app.Performance.perform(..))")
	public void performance(){}
	
	@Before ("execution(* com.mycompany.app.Performance.perform(..))")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}
	
	@Before ("execution(* com.mycompany.app.TheaterPlay.perform(..))")
	public void silenceCellPhones2(){
		System.out.println("Silencing cell phones before the play");
	}
	
	@Before ("performance()")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	
	@AfterReturning ("performance()")
	public void applause(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing ("performance()")
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}
	
	// Same effect using @Around
	/* @Around ("performance()")
	public void watchPerformance (ProceedingJoinPoint jp){
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
		}
	} */
}