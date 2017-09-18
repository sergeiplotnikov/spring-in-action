package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import spittr.data.SpittleRepository;
import spittr.data.SpittleRepositoryImpl;
import spittr.data.SpitterRepository;
import spittr.data.SpitterRepositoryImpl;

@Configuration
@ComponentScan (basePackages={"spitter"}, excludeFilters={@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
public class RootConfig {
	@Bean
	public SpittleRepository getSpittleRepo(){
		return new spittr.data.SpittleRepositoryImpl();
	}
	
	@Bean
	public SpitterRepository getSpitterRepo(){
		return new spittr.data.SpitterRepositoryImpl();
	}
}
