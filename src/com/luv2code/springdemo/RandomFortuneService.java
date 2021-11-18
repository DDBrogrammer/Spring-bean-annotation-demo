package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
   // create an array of strings
	private String[] data= {
			"ok good randomday",
			"not ok random sad day "
	};
	private Random myRandom =new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index=myRandom.nextInt(data.length);
		String theRandom=data[index];
		return theRandom;
	}

}
