package com.udemy.springdemo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigSpringMainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeamName());
		System.out.println(theCoach.getEmailId());
		context.close();
	}

}
