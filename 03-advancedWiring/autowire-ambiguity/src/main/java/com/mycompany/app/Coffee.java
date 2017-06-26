package com.mycompany.app;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Qualifier("blackCoffee")
public class Coffee implements Dinner{
	private Boolean withCream;
}