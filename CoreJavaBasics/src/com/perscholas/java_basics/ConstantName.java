package com.perscholas.java_basics;

public class ConstantName {
	
	private String name;
	
	//Default constructor
	public ConstantName(){
		this.name = "Desmond";
	}
	//Input Constructor
	public ConstantName(String name) {
		this.name = name;
	}
	
	public int nameLength() {
		
		return name.length();
		
	}
	
	public void printName() {
		System.out.println("Name is: " + name + ". It's length is: " + nameLength());
	}
	
}
