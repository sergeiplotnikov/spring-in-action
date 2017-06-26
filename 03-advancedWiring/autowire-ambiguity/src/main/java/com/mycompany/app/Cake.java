package com.mycompany.app;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class Cake implements Dessert{
	private String flavor;
}