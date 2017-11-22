package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
     //   Coach cricCoach = context.getBean("cricketCoach", Coach.class);
       // CricketCoach crCoach = context.getBean("cricketCoach", CricketCoach.class);
      //  Coach hockCoach = context.getBean("hockeyCoach", Coach.class);
		// call methods on bean
		
		System.out.println(theCoach.getDailyWorkout()); 
		System.out.println(theCoach.getDailyFortune());
	//	System.out.println(cricCoach.getDailyWorkout());
		//System.out.println(cricCoach.getDailyFortune());
		//System.out.println(crCoach.getEmailAddress());
		//System.out.println(crCoach.getTeam());
	//	System.out.println(hockCoach.getDailyWorkout());
		
		// close the context
		
		context.close();

	}

}
