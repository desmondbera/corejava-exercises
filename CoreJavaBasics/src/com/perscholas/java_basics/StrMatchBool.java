package com.perscholas.java_basics;

public class StrMatchBool {
	private static String str1;
	private static String str2;
	private static String str3;
	private static String str4;
	
	public StrMatchBool() {
		this.str1 = "Hello";
		this.str2 = "Hello";
		this.str3 = "World";
		this.str4 = "world";
	}
	
	public static boolean StrOneMatchStrTwo() {
		
		if(str1.equals(str2)) {
			System.out.println("True: Str 1 does equal Str 2");
			return true;
		}
		System.out.println("False: Str 1 does not equal Str 2");
		return false;
	}
	
	public static boolean StrThreeMatchStrFour() {
		if(str3.equals(str4)) {
			System.out.println("True: Str 3 does equal Str 4.");
			return true;
		}
		System.out.println("False: Str 3 does not equal Str 4");
		return false;
	}
	
	public static boolean StrThreeMatchStrFourIgnoreCase() {
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("True: Str 3 does equal Str 4");
			return true;
		}
		System.out.println("False: Str 3 does not equal Str 4");
		return false;
	}
	
}
