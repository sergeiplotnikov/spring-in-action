package com.mycompany.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
		//Knight knight = context.getBean(Knight.class);
		//would work for a single Knight bean, doesn't because there are two.
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();
		context.close();
	}
}

