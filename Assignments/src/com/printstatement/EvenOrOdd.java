package com.printstatement;

public class EvenOrOdd {

	public void noIsEvenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("num is even");
		} else
			System.out.println("num is odd");
	}
	
	public void noIsGreater100(int number) {
		if(number >100) {
			System.out.println("given number is greater than 100");
		}
		else
		{
			System.out.println("number is less than 100");
		}
	}
	
	public int squareOfNo(int  num) {
		return num * num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 23;
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		evenOrOdd.noIsEvenOrOdd(number);
		System.out.println("Square of no "+ number +": " + evenOrOdd.squareOfNo(number));

	}

}
