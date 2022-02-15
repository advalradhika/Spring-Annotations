package com.udemy.springdemo;

import org.springframework.stereotype.Component;

@Component

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "It's a lucky day";
	}

}
