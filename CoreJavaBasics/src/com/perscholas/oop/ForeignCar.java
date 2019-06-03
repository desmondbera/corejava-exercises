package com.perscholas.oop;

public class ForeignCar extends Car {
	
	//Constructor 1
	public ForeignCar() {
		super();
	}
	//Constructor 2
	public ForeignCar(String yearBuilt) {
		super(yearBuilt);
	}
	//Constructor 3
	public ForeignCar(String make, String model, String yearBuilt, int miles) {
		super(make, model, yearBuilt, miles);
	}
//	public void finalKeyWordDemo() {
//		
//	}
}
