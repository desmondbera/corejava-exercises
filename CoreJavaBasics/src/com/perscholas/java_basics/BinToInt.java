package com.perscholas.java_basics;

public class BinToInt {
	
	private String num1;
	
	BinToInt(String num1) {
		this.num1 = num1;
		System.out.println("Our binary " + num1 + " converted to Integer is: " + Integer.parseInt(num1, 2));
	}
	
}
