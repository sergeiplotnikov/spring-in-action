package com.mycompany.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class App 
{
	public static void main( String[] args )
   	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		InterfaceX x1 = (InterfaceX) context.getBean(Ability.class);
		x1.doTheOldThing();
		//x1.doTheNewThing();
	}
}
