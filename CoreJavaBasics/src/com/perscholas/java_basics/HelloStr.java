package com.perscholas.java_basics;

public class HelloStr {
	
	private String helloStr;
	
	public HelloStr() {
		this.helloStr = "Hello World!";
	}
	
	public void printSeventhChar() {
		System.out.println("Seventh characte of our string is: " + helloStr.charAt(6));
	}
	
	public void printSeventhCharSub() {
		System.out.println("Seventh character til end is: " + helloStr.substring(6));
	}
	
}
