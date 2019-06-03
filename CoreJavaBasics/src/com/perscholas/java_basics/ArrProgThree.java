package com.perscholas.java_basics;

public class ArrProgThree {
	
	private int intArr[];
	
	ArrProgThree() {
		this.intArr = new int[5];
		intArr[0] = 5;
		intArr[1] = 10;
		intArr[2] = 15;
		intArr[3] = 20;
		intArr[4] = 25;
		System.out.println("First value is: " + intArr[0]);
		System.out.println("Last value is: " + intArr[intArr.length -1]);
	}
	
}
