package com.udemy.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Sad day";
	}

}
