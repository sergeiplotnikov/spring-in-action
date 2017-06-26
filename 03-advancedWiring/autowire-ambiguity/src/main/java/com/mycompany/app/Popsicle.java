package com.mycompany.app;
import org.springframework.stereotype.Component;

@Component
@FlavoredIce
@HardIce
public class Popsicle implements Dessert{
	private String flavor;
}