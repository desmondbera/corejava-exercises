package com.perscholas.cafe;

import java.text.DecimalFormat;

public class Espresso extends Product {
	
	private boolean extraShot;
	private boolean macchiato;
	
	public Espresso() {
		super();
		this.extraShot = false;
		this.macchiato = false;
	}
	
	public Espresso(boolean extraShot, boolean macchiato, String name, double price, String description) {
		super(name, price, description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}
	
	//Setters 
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}
	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}
	//Getters
	
	public boolean getShot() {
		return extraShot;
	}
	
	public boolean getMacchiato() {
		return macchiato;
	}
	
	
	public String calculateProductSubtotal(int count, double price, boolean extraShot, boolean machiatto) {
		// TODO -- add $ 2.00 to each item with an extra shot 
		// TODO -- Add $1.00 to each item made in macchiato style
		double optionsTotal = 0.00; 
		
		if(extraShot) {
			optionsTotal = 2.00 * count;
		}
		
		if(machiatto) {
			optionsTotal += 1.00 * count;
		}
		
//		System.out.println("Options total is: " + optionsTotal);
		
		DecimalFormat f = new DecimalFormat("##.00");
		
		return f.format( (count * price) + optionsTotal);
	}
	
	@Override
	public String addOptions() {
		return "test";
	}
	@Override
	public void printOptions(int count) {
		if(count == 0) {
			System.out.println("Extra shot? Please type 'Y' or 'N': ");
		} else {
			System.out.println("Machiatto? Please type 'Y' or 'N': ");
		}
	}
}
