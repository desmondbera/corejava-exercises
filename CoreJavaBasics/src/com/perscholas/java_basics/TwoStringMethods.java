package com.perscholas.java_basics;

public class TwoStringMethods {
	
	private String firstName = null;
	private String lastName = null;
	
	//Default Constructor
	public TwoStringMethods() {
		this.firstName = "Desmond";
		this.lastName = "Beramendi";
	}
	
	//Constructor w/ input
	public TwoStringMethods(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	public void concatMethodOne() {
		StringBuilder sb = new StringBuilder(firstName);
		sb.append(" ");
		sb.append(lastName);
//		System.out.println("Using string builder to concat: " + sb);
		
		printConcat(sb.toString());
	}
	
	public void concatMethodTwo() {
		String newStr = firstName.concat(" ").concat(lastName);
		printConcat(newStr);
	}
	
	public void printConcat(String input) {
		System.out.println("Our full name is: " + input);
	}
	
}
