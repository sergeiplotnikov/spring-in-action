package beantest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class JavaConfig{
	
	@Bean 
	public ClassAAA aaa(){
		return new ClassAAA();
	}	

	@Bean
	public ClassBBB bbb(){
		return new ClassBBB();
	}

	@Bean
	public Aspect1 aspect1(){
		return new Aspect1();
	}
}
