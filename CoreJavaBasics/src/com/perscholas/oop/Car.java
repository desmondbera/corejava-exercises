package com.perscholas.oop;

public class Car {

	private String make;
	private String model;
	private String yearBuilt;
	private int miles;
	
	//Constructor 1
	public Car() {	
	}
	//Constructor 2
	public Car(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	//Constructor 3
	public Car(String make, String model, String yearBuilt, int miles) {
		this.make = make;
		this.model = model;
		this.yearBuilt = yearBuilt;
		this.miles = miles;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	public void driveForward() {
		miles+=10;
	}
	
	public void driveReverse() {
		miles-=10;
	}
	
	public int getMiles() {
		return miles;
	}
	
	public final void finalKeyWordDemo() {
		System.out.println("Final Method Demo");
	}
}
