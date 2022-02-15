package com.udemy.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${EmailId}")
	private String EmailId;

	@Value("${TeamName}")
	private String TeamName;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public String getEmailId() {
		return EmailId;
	}

	public String getTeamName() {
		return TeamName;
	}

}
