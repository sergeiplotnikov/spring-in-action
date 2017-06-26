package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Qualifier;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(classes=Config.class)

public class FoodTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	// 'Primary' Lunch bean is set to Pizza in config.xml
	private Lunch lunch;
	
	@Autowired
	// 'Primary' Desset bean is set to Cake using annotation
	private Dessert dessert;
	
	@Autowired
	@Qualifier("omelette")
	// This qualifier is set next to the @Component annotation
	// alternatively it could be set next to @Bean annotation in Java-config file
	private Breakfast breakfast;
	
	@Autowired
	@FlavoredIce
	@SoftIce
	// FlavoredIce implemented by Slush and Popsicle
	// SoftIce implemented by Slush and Sorbet
	// Only a combination of the above two custom qualifiers retrieves a Slush bean
	private Dessert frozenTreat;
	
	@Autowired
	@Qualifier("blackCoffee")
	private Dinner dinner;
	
	@Test
	public void autoWiredPrimaryBeans() {
		assertNotNull(lunch);
		assertNotNull(dessert);
	}
	
	@Test
	public void qualifierTest(){
		assertNotNull(breakfast);
		assertNotNull(dinner);
	}
	
	@Test
	public void customQualifiersTest(){
		assertTrue(frozenTreat.getClass() == com.mycompany.app.Slush.class);
	}
}
