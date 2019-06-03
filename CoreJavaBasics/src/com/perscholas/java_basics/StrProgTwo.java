package com.perscholas.java_basics;

public class StrProgTwo {

	
	public void LoopHelloStr() {
//		String str1 = "Hello";
//		String str2 = "";
//		for(int x = str1.length()-1; x >= 0; x--) {
//			str2 += str1.charAt(x);
//		}
//		System.out.println("Str2 is: " + str2);
		
		StringBuilder str1 = new StringBuilder("Hello");
		StringBuilder str2 = new StringBuilder("");
		for(int x = str1.length()-1; x >= 0; x--) {
			str2.append(str1.charAt(x));
		}
		System.out.println("Str2 is: " + str2);
	}
	
}
