package com.perscholas.java_basics;

public class ArrProgTwo {
	
	private String strArr[];
	
	ArrProgTwo() {
		this.strArr = new String[4];
		strArr[0] = "red";
		strArr[1] = "green";
		strArr[2] = "blue";
		strArr[3] = "yellow";
		
		System.out.println("Str arr length is: " + strArr.length);
		String[] copyArr = strArr.clone();
		copyArr.toString();
		
	}
}
