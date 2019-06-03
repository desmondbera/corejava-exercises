package com.perscholas.java_basics;

public class LessThanFour {
	private int x;
	
	LessThanFour() {
		this.x = 5;
	}
	
	public void LessThanMethod() {
		if(x < 10 || x > 20) {
			System.out.println("Out or range");
		}else {
			System.out.println("In range");
		}
	}
	
}
