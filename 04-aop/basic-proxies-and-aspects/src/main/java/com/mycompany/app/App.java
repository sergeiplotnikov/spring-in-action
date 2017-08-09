package com.mycompany.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;

public class App{
	public static void main(String[] args){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

				
		InterfaceX x1 = (InterfaceX) context.getBean(InterfaceX.class);
		x1.doX();

		InterfaceY y1 = (InterfaceY) context.getBean("CCC");
		y1.doY();
		

		InterfaceXY xy1 = (InterfaceXY) context.getBean("DDD");
		xy1.doXY();
	}
}
