package com.perscholas.java_basics;

public class LessThan10Two {
	private int x;
	
	LessThan10Two() {
		this.x = 15;
	}
	
	public void IsLessThanMethod() {
		if(x < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
	}
}
