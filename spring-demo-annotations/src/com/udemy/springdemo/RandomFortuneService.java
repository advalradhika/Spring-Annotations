package com.udemy.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Great day : Random Fortune Service";
	}

}
