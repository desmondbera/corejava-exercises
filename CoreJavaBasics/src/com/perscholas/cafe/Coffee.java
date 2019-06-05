package com.perscholas.cafe;

import java.text.DecimalFormat;

public class Coffee extends Product {

	private boolean sugar;
	private boolean milk;
	
	//Constructor 1 
	public Coffee() {
		super();
		this.milk = false;
		this.sugar = false;
	}
	
	// Constructor 2 
	public Coffee(boolean sugar, boolean milk, String name, double price, String description) {
		super(name, price, description);
		this.sugar = sugar;
		this.milk = milk;
	}
	
	//Setters
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	//Getters 
	public boolean getSugar() {
		return sugar;
	}
	public boolean getMilk() {
		return milk ;
	}
	
	public String calculateProductSubtotal(int count, double price) {
		DecimalFormat f = new DecimalFormat("##.00");
		return f.format(count * price);
	}
	
	@Override
	public String addOptions() {
		//TODO
		return "";
	}

	public void printOptions(int count) {
		if(count == 0) {
			System.out.println("Sugar? Please type 'Y' or 'N': ");
		} else {
			System.out.println("Milk? Please type 'Y' or 'N': ");
		}
	}

	@Override
	public String calculateProductSubtotal(int count, double price, boolean x, boolean y) {
		// TODO Auto-generated method stub
		return null;
	}
}
