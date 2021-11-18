package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;
    
    @Value("${foo.team}")
    private String team;
    
    @Value("${foo.email}")
    private String email;
    
    public SwimCoach(FortuneService fortuneService) {
    	this.fortuneService=fortuneService;
    }
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 200 meter";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	public String getTeam() {
		return team;
	}
	public String getEmail() {
		return email;
	}

}
