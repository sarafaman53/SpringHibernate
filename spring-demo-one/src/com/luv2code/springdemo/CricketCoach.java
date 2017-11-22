package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	// add new fields
	
	private String emailAddress;
	private String team; 
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside the setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Inside the setter method - Set Team");
		this.team = team;
	}

	public CricketCoach() {
		
		System.out.println("Inside no-arg constructor");
	}
	
	private FortuneService fortuneService;
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do Batting and Bowling for 10 overs";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	

}
