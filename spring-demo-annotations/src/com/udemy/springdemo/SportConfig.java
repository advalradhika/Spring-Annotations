package com.udemy.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.udemy.springdemo")
@PropertySource("classpath:application.properties")
public class SportConfig {

	// Define Bean for Sad Fortune Service : method name is BeanId
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// Define Bean for Swim Coach and inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
