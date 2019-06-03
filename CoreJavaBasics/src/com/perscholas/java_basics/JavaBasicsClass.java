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
		seventhProblem.printName();
		ConstantName seventhProblemTwo = new ConstantName("Test-name");
		seventhProblemTwo.printName();
		
		//8. 8th problem
		CafeStore eightProblem = new CafeStore();
		eightProblem.totalCostOfCoffees(3);
		eightProblem.totalCostOfCappuccino(3);
		eightProblem.totalCostOfGreenTeas(3);
		eightProblem.setSubTotal();
		eightProblem.setTotal();
		eightProblem.getTotal();
		// 2nd step of problem 8
		eightProblem.printEverything();
		
		//9. 9th problem
		TwoStringMethods ninethProblemTwo = new TwoStringMethods("Jason", "Bourne");
		ninethProblemTwo.concatMethodOne();
		ninethProblemTwo.concatMethodTwo();
		
		TwoStringMethods ninethProblem = new TwoStringMethods();
		ninethProblem.concatMethodOne();
		ninethProblem.concatMethodTwo();
		
		//10th problem
		NameLength tenthProblem = new NameLength("Desmond", "Beramendi");
		tenthProblem.printFirstLen();
		tenthProblem.printLastLen();
		tenthProblem.printFullLen();
		
		//11th problem
		StrMatchBool eleventhProblem = new StrMatchBool();
		StrMatchBool.StrOneMatchStrTwo();
		StrMatchBool.StrThreeMatchStrFour();
		StrMatchBool.StrThreeMatchStrFourIgnoreCase();
		
		//12th problem
		HelloStr twelvethProblem = new HelloStr();
		twelvethProblem.printSeventhChar();
		twelvethProblem.printSeventhCharSub();
		
		//13th problem
		ScannerInts thirteenthProblem = new ScannerInts();
		thirteenthProblem.printSum();
		
		//14th problem - Convert ints to binary notation
		// 1 is 0001
		IntToBin fourteenthProblem = new IntToBin(1);
		//8 is 1000
		IntToBin fourTeenthTwo = new IntToBin(8);
		// 33 is 100011 -- WRONG. It's 100001
		IntToBin fourTeenthThird = new IntToBin(33);
		// 78 is 1010110 = wrong it's 1001110
		IntToBin fourTeenthFour = new IntToBin(78);
		// 787 is 1100010011
		IntToBin fourTeenthFive = new IntToBin(787);
		//33987 is 1000010011000011
		IntToBin fourTeenthSix = new IntToBin(33987);
		
		// 15th problem - Convert binary nums to decimal notation
		// 0010 is 2
		BinToInt fifteenthProblem = new BinToInt("0010");
		// 1001 is 9
		BinToInt fifteenthTwo = new BinToInt("1001");
		// 0011 0100 is 52
		BinToInt fifteenthThird = new BinToInt("00110100");
		// 0111 0010 is 114
		BinToInt fifteenthFour = new BinToInt("01110010");
		// 0010 0001 1111 is 543
		BinToInt fifteenthFive = new BinToInt("001000011111");
		//0010 1100 0110 0111 is 22631 -- wrong! IT'S 11367
		// 1 + 2 + 4 // 32 + 64 // 2048 + 1024 // 8192
		BinToInt fifteenthSix = new BinToInt("0010110001100111");
		
		//16th Problem
		BitwiseAndOr sixteenthProblem = new BitwiseAndOr();
		sixteenthProblem.doBiteWiseAnd();
		sixteenthProblem.printZ();
		
		BitwiseAndOr sixteenthProblemTwo = new BitwiseAndOr();
		sixteenthProblem.doBiteWiseOr();
		sixteenthProblem.printZ();
		
		//17th problem
		IncrementProg seventeenthProblem = new IncrementProg();
		seventeenthProblem.printNum();
		
		//18th problem
		IncrementProgThree eighteenthProblem = new IncrementProgThree();
		eighteenthProblem.MethodOne();
		eighteenthProblem.MethodTwo();
		eighteenthProblem.MethodThree();
		
		//19th problem
		IncrementProgFour nineteenthProblem = new IncrementProgFour();
		nineteenthProblem.MethodOne();
		
		//20th problem
		LessThan10 twentiethProblem = new LessThan10();
		twentiethProblem.isLessThan10();
		
		//21st problem
		LessThan10Two twentyfirstProblem = new LessThan10Two();
		twentyfirstProblem.IsLessThanMethod();
		//2nd problem
		LessThan10Three twentysecondProblem = new LessThan10Three();
		twentysecondProblem.isLessThanMethod();
		
		//23rd problem
		LessThanFour twentythirdProblem = new LessThanFour();
		twentythirdProblem.LessThanMethod();
		
		//24th problem
		GradeProg twentyFourthProblem = new GradeProg();
		twentyFourthProblem.checkInRange();
		
		//25th problem
		SwitchProg twentyFifthProblem = new SwitchProg();
		twentyFifthProblem.printWeekday();
		
		//26th problem
		LoopProg twentySixthProblem = new LoopProg();
		twentySixthProblem.LoopTo10();
		
		//27th problem
		LoopProgTwo twentySeventhProblem = new LoopProgTwo();
		twentySeventhProblem.LoopTo100();
		
		//28th problem
		LoopProgThree twentyEighthProblem = new LoopProgThree();
		twentyEighthProblem.doWhileLoop();
		
		//29th problem
		LoopProgFour twentyNinethProblem = new LoopProgFour();
		twentyNinethProblem.Loop5();
		
		//30th problem
		LoopProgFive thirtiethProblem = new LoopProgFive();
		thirtiethProblem.LoopTo50();
		
		//31st problem 
		LoopProgSix thirtyFirstProblem = new LoopProgSix();
		thirtyFirstProblem.LoopThruWeeks();
		
		//32nd problem
		LoopProgSeven thirtySecondProblem = new LoopProgSeven();
		thirtySecondProblem.NestedLoop();
		
		//33rd problem - beginning of More On Strings
		StrProg thirtyThirdProb = new StrProg();
		
		//34th problem
		StrProgTwo thirtyFourthProb = new StrProgTwo();
		thirtyFourthProb.LoopHelloStr();
		
		//35th Problem
		StrProgThree thirtyFifthProblem = new StrProgThree();
		thirtyFifthProblem.LoopMultiStr();
		
		// 36th problem - Beginning of Arrays
		ArrProg thirtySixthProb = new ArrProg();

		// 37th problem 
		ArrProgTwo thirtySeventhProb = new ArrProgTwo();
		
		// 38th problem
		ArrProgThree thirtyEighthProb = new ArrProgThree();
		
		// 39th problem
		ArrProgFour thirtyNinethProb = new ArrProgFour();
		
		// 40th problem
		ArrProgFive fourtiethProb = new ArrProgFive();
		
		// 41st problem
		ArrProgSix fortyFirstProb = new ArrProgSix();
		
		//42nd problem
		ArrProgSeven fortySecondProb = new ArrProgSeven();
		
		//43rd problem
		ArrProgEight fortyThirdProb = new ArrProgEight();
		
	}

}
