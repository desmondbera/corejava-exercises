package com.perscholas.java_basics;

public class ArrProgSix {

	private String strArr[];
	
	ArrProgSix() {
		this.strArr = new String[5];
		strArr[0] = "Des";
		strArr[1] = "mond";
		strArr[2] = "Test";
		strArr[3] = "Bera";
		strArr[4] = "mendi";
		
		for(int x = 0; x < strArr.length; x++) {
			if(x == 2) {
				continue;
			} else {
				System.out.println("X is: " + strArr[x]);
			}
 		}
		
	}
	
}
