package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		//1. 1st problem - using constructor
		AddTwoInts firstProblem = new AddTwoInts(100, 100);
		firstProblem.Ans();
		
		//2. 2nd problem - using getters and setters
		AddTwoDoubles secondProblem =  new AddTwoDoubles();
		secondProblem.setNums(10.0, 10.5);
		secondProblem.printTotal();
		
		//3. 3rd problem - using getters and setters
		// When 1 operand is an int AND another is a double, 
		// Java creates a new temp value that is the double VERSION of the INT operand
		AddDoubleAndInt thirdProblem = new AddDoubleAndInt();
		thirdProblem.setNums(60, 9.69);
		thirdProblem.printTotal();
		
		//4. 4th problem - using constructor - in this we originally had ints but we
		// changed it to doubles to accepts doubles in case inputs are doubles
		AddTwoIntsDivide fourthProblem = new AddTwoIntsDivide(10, 20);
		fourthProblem.printResult();
		
		//5. 5th problem 
		AddTwoDoublesDivide fifthProblem = new AddTwoDoublesDivide();
		fifthProblem.setNums(10.50, 200.25);
		fifthProblem.printTotal();
		
		//6. 6th problem
		AssignXtoY sixthProblem = new AssignXtoY();
		sixthProblem.setNums(5,  6);
		sixthProblem.printQ();
		AssignXtoY sixthProblemTwo = new AssignXtoY();
		sixthProblemTwo.yToDouble();
		
		//7. 7th problem
		ConstantName seventhProblem = new ConstantName();

	}

}
