package com.perscholas.java_basics;

import java.util.Arrays;

public class ArrProgSeven {

	private String strArr[];
	
	ArrProgSeven() {
		this.strArr = new String[5];
		strArr[0] = "Des";
		strArr[1] = "mond";
		strArr[2] = "Test";
		strArr[3] = "Bera";
		strArr[4] = "mendi";
		for(int x = 0; x < strArr.length; x++) {
			if(x == 2) {
				String temp = strArr[x];
				strArr[x] = strArr[0];
				strArr[0] = temp; 
			}
		}
		System.out.println("Our strArr is: " + Arrays.deepToString(strArr));
	}
	
}
