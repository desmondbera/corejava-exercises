package com.perscholas.java_basics;

import java.util.Arrays;

public class ArrProgFive {
	private int intArr[];
	
	ArrProgFive() {
		this.intArr = new int[5];
		for(int x = 0; x < intArr.length; x++) {
			intArr[x] = x * 2;
		}
		System.out.println("Int arr is: " + Arrays.toString(intArr));
	}
}
