package com.perscholas.oop;

public class CarApp {

	public static void main(String[] args) {
		Car desCar = new Car();
		desCar.setMake("Mercedez-Benz");
		desCar.setModel("GTR-3");
		desCar.setYearBuilt("2019");
		
		System.out.println(desCar.getMake());
		System.out.println(desCar.getModel());
		System.out.println(desCar.getYearBuilt());
		desCar.setMiles(0);
		
		System.out.println("Our current mileage is: "+ desCar.getMiles());
		desCar.driveForward();
		desCar.driveForward();
		System.out.println("Our mileage is now: " + desCar.getMiles());
		
		desCar.driveReverse();
		System.out.println("Our final mileage is: " + desCar.getMiles());
		
		System.out.println("=======");
		
		Car oneArgCar = new Car("2018");
		oneArgCar.setModel("Focus");
		oneArgCar.setMake("Ford");
		oneArgCar.setMiles(10000);
		System.out.println("Our car is " + oneArgCar.getYearBuilt() + " " + oneArgCar.getMake() + " " + oneArgCar.getModel() +" with " + oneArgCar.getMiles() + " miles.");
		
		System.out.println("=======");
		
		Car allArgCar = new Car("Honda", "Civic", "2005", 90000);
		System.out.println("Selling a " + allArgCar.getMake() + " " + allArgCar.getModel() + " with " + allArgCar.getMiles() + " miles. Almost forgot, it was born on " + allArgCar.getYearBuilt() );
		
		System.out.println("=======");
		
		ForeignCar lambo = new ForeignCar();
		lambo.setMake("Lamboguihninnn");
		lambo.setModel("Diablo");
		lambo.setYearBuilt("2020");
		lambo.setMiles(0);
		System.out.println("--");
		ForeignCar ferrari = new ForeignCar("2019");
		ferrari.setMake("Ferrari");
		ferrari.setModel("Mercialago");
		ferrari.setMiles(500);	
		System.out.println("--");
		ForeignCar toyotaCar = new ForeignCar("Toyota", "Camry", "2001", 70000);
		System.out.println("=======");
	}

}
