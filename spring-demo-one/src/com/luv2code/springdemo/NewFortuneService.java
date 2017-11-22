package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Random;

public class NewFortuneService implements FortuneService {

	ArrayList<String> fortunes = new ArrayList<String>();
	
	Random ra = new Random();
	@Override
	public String getFortune() {
		
		fortunes.add("Test1");
		fortunes.add("Test 2");
		fortunes.add("Test 3");
		
		return fortunes.get(ra.nextInt(fortunes.size()));
	}

}
