package com.perscholas.java_basics;

public class RegExProg {
	
	private String str;
	
	RegExProg() {
		this.str = "Don't repeat yourself";
		String tempArr[];
		tempArr = str.split(" ");
		for(int x = 0; x < tempArr.length; x++) {
			System.out.println("Current temp arr is: " + tempArr[x]);
		}
	}
	
}
