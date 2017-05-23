package com.mycompany.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig{
	@Bean
	//deffault bean id is same as @Bean annotated method's name
	//@Bean(name="lonelyHearsClubBand")
	//or rename the method
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc cd){
		return new CDPlayer(cd);
	}
	//another option is:
	/*public CDPlayer cdPlayer(){
		return new CDPlayer(sgtPeppers();
	}*/
}