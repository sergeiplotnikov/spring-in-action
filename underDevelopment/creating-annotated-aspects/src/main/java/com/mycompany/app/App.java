package com.mycompany.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.aop.framework.ProxyFactory;

public class App{
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/config.xml");

		//Performance metalConcert = (Performance)context.getBean("metal");
		Performance metalConcert = new MetalConcert();
		
		metalConcert.perform();
		
		
		
		ProxyFactory factory = new ProxyFactory(new MetalConcert());
        factory.addInterface(Performance.class);
        //factory.addAdvice(new Audience());

        Performance pojo = (Performance) factory.getProxy();

        // this is a method call on the proxy!
        pojo.perform();
		
		TheaterPlay tp = (TheaterPlay)context.getBean("play");
		tp.perform();
		
		TheaterPlay tp2 = new TheaterPlay();
		tp2.perform();

	}
}