package com.luv2code.springdemo;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;


@Component

public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
    /*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
     */
	public TennisCoach() {
		System.out.println("Running default constructor");
	}
	//create setter
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.err.println("running setter method when using Autorwire");
		this.fortuneService = fortuneService;
	}*/
	// define my init method
    @PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("Do my start up stuff");
	}
	// define my destroy method
    @PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("Do my clean stuff");
	}
	@Override
	public String getDailyWorkout() {
	
		return "Practice to play tennis";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}



	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
