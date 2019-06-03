package com.perscholas.java_basics;

public class IncrementProgFour {
	private int x;
	private int y;
	
	
	IncrementProgFour() {
		this.x = 5;
		this.y = 8;
	}
	
	public void MethodOne() {
		int sum = (x++) + y;
		System.out.println("Our sum in method one is: " + sum);
		System.out.println("Our x is " + x);
	}
	
}
