package com.perscholas.java_basics;

import java.util.Arrays;

public class ArrProgEight {
	private Object objArr[];
	
	ArrProgEight() {
		this.objArr = new Object[5];
		objArr[0] = 1;
		objArr[1] = "Des";
		objArr[2] = "was";
		objArr[3] = "here";
		objArr[4] = 3.5;
		System.out.println("our array has multiple types: " + Arrays.deepToString(objArr));
	}
}
