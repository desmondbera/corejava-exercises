package com.perscholas.cafe;

import java.text.DecimalFormat;

public class Cappuccino extends Product {
	private boolean peppermint;
	private boolean whippedCream;
	
	
	//Constructor 1 
	public Cappuccino() {
		this.peppermint = false;
		this.whippedCream = false;
	}
	
	//Constructor 2 
	public Cappuccino(boolean peppermint, boolean whippedCream, String name, double price, String description) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}
	
	//Setters 
	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}
	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
	
	//Getters
	public boolean getPeppermint() {
		return peppermint;
	}
	public boolean getWhippedCream() {
		return whippedCream;
	}
	
	@Override
	public String calculateProductSubtotal(int count, double price, boolean pepper, boolean whip) {
		//TODO: Add $2.00 to each item with peppermint
		// TODO: Add $1.00 to each item with whipped cream;
		double optionsTotal = 0.00;
		if(pepper) {
			optionsTotal = 2.00 * count;
		}
		
		if(whip) {
			optionsTotal += 1.00 * count;
		}
		
		DecimalFormat f = new DecimalFormat("##.00");
		return f.format( (count * price) + optionsTotal);
	}
	@Override
	public String addOptions() {
		return "test-1";
	}
	
	@Override 
	public void printOptions(int count) {
		if(count == 0) {
			System.out.println("Peppermint? Please type 'Y' or 'N': ");
		} else {
			System.out.println("Whipped cream? Please type 'Y' or 'N': ");
		}
	}
}
