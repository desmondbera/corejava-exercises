package com.perscholas.java_basics;

public class LessThan10Three {
	private int x;
	
	LessThan10Three() {
		this.x = 15;
	}
 	
	public void isLessThanMethod() {
		if(x < 10) {
			System.out.println("Less than 10");
		} else if(x >= 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else if(x >= 20) {
			System.out.println("Greater than or equal to 20");
		}
	}
}
