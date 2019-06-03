package com.perscholas.java_basics;

public class NameLength {
	private String firstName;
	private String lastName;
	private String fullName;
	
	public NameLength(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + lastName;
	}
	
	public void printFirstLen() {
		System.out.println("First name "+ firstName + " is "+ firstName.length() + " characters long.");
	}
	
	public void printLastLen() {
		System.out.println("Last name " + lastName + " is " + lastName.length() + " characters long.");
	}
	
	public void printFullLen() {
		System.out.println("Full name is " + fullName.length() + " characters long.");
	}
	
}
