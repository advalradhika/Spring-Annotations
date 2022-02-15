package com.udemy.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Inside setter : setFortuneService : TennisCoach");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley for 10 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	@PostConstruct
	public void customInit() {
		System.out.println("Just post Initialization method");
	}
	
	@PreDestroy
	public void customDestroy() {
		System.out.println("Just pre Destruction method");
	}

}
