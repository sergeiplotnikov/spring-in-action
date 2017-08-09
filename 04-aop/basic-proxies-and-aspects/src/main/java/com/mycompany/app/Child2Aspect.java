package com.mycompany.app;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.annotation.Around;


@Aspect
public class Child2Aspect{

	@Before ("execution(* com.mycompany.app.InterfaceXY.doXY(..))")
	public void someoneDoesXY(){
		System.out.println(":::::Child2Aspect::::: a someone-does-XY advice was triggered ::::::");
	}

	// uncommenting the following advice would throw an exception during run time, cuz thats when Spring-AOP weaving takes place,
	// because com.mycompany.app.insidePackage666() IS PRIVATE and thus unaccessable
	//@Before ("com.mycompany.app.ParentAspect.someoneDoesY() && com.mycompany.app.ParentAspect.insidePackage666() ")
	public void doesYfrom666(){
		System.out.println(":::::Child2Aspect::::: a someone-does-Y-and-located-inside-package666 advice was triggered ::::: ");
	}
}
