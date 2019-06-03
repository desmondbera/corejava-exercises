package com.perscholas.java_basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExProgFour {
	String hexCode;
	
	RegExProgFour(String hexCode) {
		this.hexCode = hexCode;
	}
	
	public void isValidHex() {
		String regex = "^#[A-Fa-f0-9]{3,6}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(hexCode);
		boolean b = m.matches();
		if(b) {
			System.out.println("Valid CSS hexideciaml color!");
		} else {
			System.out.println("Not a valid CSS hex color!");
		}
	}
	
}
