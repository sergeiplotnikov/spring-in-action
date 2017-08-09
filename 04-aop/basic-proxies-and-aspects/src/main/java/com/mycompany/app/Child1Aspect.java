package com.mycompany.app;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.annotation.Around;


@Aspect
public class Child1Aspect{
	@Before ("com.mycompany.app.ParentAspect.someoneDoesY() && com.mycompany.app.ParentAspect.insidePackage123() ")
	public void doesYfrom123(){
		System.out.println(":::::Child1Aspect::::: a someone-does-Y-and-located-inside-package123 advice was triggered ::::: ");
	}
}
