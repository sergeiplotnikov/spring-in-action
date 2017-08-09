package com.mycompany.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig{
	
	@Bean
	public InterfaceX beanImplementingX(){
		return new ClassAAA();
	}

	@Bean ("CCC")
	public InterfaceY beanImplementingY(){
		return new com.mycompany.app.package123.ClassCCC();
	}

	@Bean ("DDD")
	public InterfaceXY beanImplementingXY(){
		return new com.mycompany.app.package666.ClassDDD();
	}
	
	@Bean
	public ParentAspect parentAspectBean(){
		return new ParentAspect();
	}
	
	@Bean
	public Child1Aspect child1Aspect(){
		return new Child1Aspect();
	}

	@Bean
	public Child2Aspect child2Aspect(){
		return new Child2Aspect();
	}
	
}
