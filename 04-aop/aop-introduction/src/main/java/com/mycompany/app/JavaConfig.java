package com.mycompany.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
	
	@Bean
	public ClassA classA(){
		return new ClassA();
	}

	@Bean
	public TheIntroducer introducer(){
		return new TheIntroducer();
	}
}
