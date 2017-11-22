package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	// define a private field for the dependency 
	
	private FortuneService fortuneService;

	private NewFortuneService newfortuneService;
	// define a constructor for Dependency injection 
	
	public BaseballCoach(NewFortuneService thenewFortuneService 
			, FortuneService thefortuneService) {
	
		newfortuneService = thenewFortuneService;
		fortuneService = thefortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// usemyfortune service to get a fortune
		
		return newfortuneService.getFortune();
	}
	
}
