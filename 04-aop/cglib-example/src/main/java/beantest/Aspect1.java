package beantest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect1{
	
	@Before ("execution(* beantest.ClassAAA.doSomething(..))")
	public void beforeAAAdoesSomething(){
		System.out.println("##### BEFORE advice on AAA's doSomething() #####");
	}

	@Before ("execution(* beantest.ClassBBB.doSomething(..))")
	public void beforeBBBdoesSomething(){
		System.out.println("##### BEFORE advice on BBB's doSomething() #####");
	}
}
