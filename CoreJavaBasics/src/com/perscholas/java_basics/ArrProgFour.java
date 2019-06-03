package com.perscholas.java_basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrProgFour {

	private int intArr[];
	
	ArrProgFour() {
		this.intArr = new int[5];
		
		for(int x = 0; x < intArr.length; x++) {
			intArr[x] = x;
		}
		System.out.println("Int arr is: " + Arrays.toString(intArr));
	} 
	
}
