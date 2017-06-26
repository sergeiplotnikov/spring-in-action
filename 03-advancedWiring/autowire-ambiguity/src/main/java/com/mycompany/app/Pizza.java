package com.mycompany.app;
import org.springframework.stereotype.Component;

@Component
public class Pizza implements Lunch{
	private String[] toppings;
}