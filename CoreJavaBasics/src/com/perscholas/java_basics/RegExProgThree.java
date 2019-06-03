package com.perscholas.java_basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExProgThree {
	private String arrStr[];
	
	RegExProgThree() {
		this.arrStr = new String[4];
		arrStr[0] = "youhavefoundme";
		arrStr[1] = "youdidntfindme";
		arrStr[2] = "notinthisone";
		arrStr[3] = "itisfoundhere";
	}
	
	public void findFoundWord() {
		String regex = ".*found.*";
		Pattern found = Pattern.compile(regex);
		
		for(int x = 0; x < arrStr.length; x++) {
			Matcher m = found.matcher(arrStr[x]);
			boolean b = m.matches();
//			System.out.println("Our bool is: " + b);
			if(b) {
				System.out.println("I found it! : " + arrStr[x]);
			}
		}
	}
}
