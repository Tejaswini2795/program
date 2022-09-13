package com.printstatement;

public class Assignment5IfElse {
	public void num_PositiveOrNegative(int number) {
		if (number < 0)
			System.out.println("Given number is negative");
		else
			System.out.println("Given number is positive");
	}

	public int maxNumber(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num1 && num2 > num3) {
			return num2;
		} else
			return num3;

	}

	public void switchStatement(String month) {
		switch ("February") {
		case "January":
			System.out.println("Current month is January");
		case "February":
			System.out.println("Current month is February");
		case "March":
			System.out.println("Current month is March");

		default:System.out.println("wrong month");
			break;
		}
	}

	public static void main(String[] args) {
		Assignment5IfElse assignment5IfElse = new Assignment5IfElse();
		System.out.println("Max number: " + assignment5IfElse.maxNumber(20, 60, 30));
		assignment5IfElse.switchStatement("February");
	}

}
