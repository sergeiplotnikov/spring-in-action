package com.mycompany.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class App 
{
	public static void main( String[] args )
   	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		Object obj = context.getBean(InterfaceX.class);
		((InterfaceX) obj).doTheOldThing();
		((Ability) obj).doTheNewThing();
	}
}
