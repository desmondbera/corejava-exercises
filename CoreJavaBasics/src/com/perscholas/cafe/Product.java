package com.perscholas.cafe;

public abstract class Product {
	private String name;
	private double price;
	private String description;
	private int quantity;
	
	// Constructor 1
	public Product() {
		
	}
	
	//Constructor 2 
	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//Getters
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}
	
	//Methods
	
	// Calculate subtotal for the order
	public double calculateProductTotal(int count, double price) {
		return (count * price);
	}
	
	public abstract String calculateProductSubtotal(int count, double price, boolean x, boolean y);
	public abstract String addOptions();
	public abstract void printOptions(int count);
	
}
