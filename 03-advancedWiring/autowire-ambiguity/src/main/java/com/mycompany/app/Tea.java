package com.mycompany.app;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Qualifier("blackTea")
public class Tea implements Dinner{
	private Integer sugar;
}