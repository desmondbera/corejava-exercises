package com.perscholas.java_basics;

public class CafeStore {
	
	private double coffee = 1.50;
	private int coffeeCount;
	
	private double cappuccino = 2.65;
	private int cappCount;
	
	private double greenTea = 2.75;
	private int greenCount;
	
	private double subTotal;
	private double totalSale;
	
	private double totalCoffee;
	private double totalCapp;
	private double totalGreen;
	
	private double taxTotal;
	private static final double SALES_TAX = .06; 
	
	public void totalCostOfCoffees(int count) {
		this.coffeeCount = count;
		this.totalCoffee = coffeeCount * coffee;
		
	}
	
	public void totalCostOfCappuccino(int count) {
		this.cappCount = count;
		this.totalCapp = cappCount * cappuccino;
	}
	
	public void totalCostOfGreenTeas(int count) {
		this.greenCount = count;
		this.totalGreen = greenCount * greenTea;
	}
	
	
	public void setSubTotal() {
		this.subTotal = totalCoffee + totalCapp + totalGreen;
	}
	
	public void setTotal() {
		//1. Get tax 
		taxTotal = subTotal * SALES_TAX;
		//2. Add tax to subtotal and set it to total
		this.totalSale = taxTotal + subTotal;
	}
	
	public void getTotal() {
		System.out.println("total is: " + String.format("%.2f", totalSale));
	}
	
	public void printEverything() {
		System.out.println("Coffee: " + coffeeCount + " @ " + coffee + " = " + String.format("%.2f", totalCoffee));
		System.out.println("Cappuccino " + cappCount + " @ " + cappuccino + " = " + String.format("%.2f", totalCapp));
		System.out.println("Green tea " + greenCount + " @ " + greenTea + " = " + String.format("%.2f", totalGreen));
		System.out.println("Subtotal: $" + String.format("%.2f",subTotal));
		System.out.println("Sales tax: $" + String.format("%.2f", taxTotal));
		System.out.println("Total: $" + String.format("%.2f", totalSale));
	}
	
}
