package com.perscholas.java_basics;

public class StrProgThree {

	public void LoopMultiStr() {
		String str1 =  "Hello World!";
		String str2 =  "";
		String[] strArr = str1.split(" ");
		for(int x = 0; x < strArr.length; x++) {
			String temp = "";
//			System.out.println(strArr[x]);
			for(int y = strArr[x].length() - 1; y >= 0; y--) {
				temp += strArr[x].charAt(y);
//				System.out.println(strArr[x].charAt(y));
			}
			
			str2 += temp;
			str2 += " ";
		}
		System.out.println("Str2 is: " + str2);
	}
}
