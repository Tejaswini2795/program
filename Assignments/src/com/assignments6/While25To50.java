package com.assignments6;

import java.util.Scanner;

public class While25To50 {
	static Scanner sc = new Scanner(System.in);

	public void print25To50(int num1, int num2) {
		while (num1 <= num2) {
			System.out.println(num1);
			num1++;
		}

	}

	public void noTable(int num) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	public void evenAndOddRange(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		While25To50 while25To50 = new While25To50();

		System.out.println("Enter first no");
		int num1 = sc.nextInt();
		System.out.println("Enter second no");
		int num2 = sc.nextInt();
		while25To50.print25To50(num1, num2);

		System.out.println("Enter number which table do you want ");
		int num = sc.nextInt();
		while25To50.noTable(num);

		System.out.println("Enter number from which you want to print even numbers");
		System.out.println("Enter first no");
		int num3 = sc.nextInt();
		System.out.println("Enter second no");
		int num4 = sc.nextInt();
		while25To50.evenAndOddRange(num3, num4);

	}

}
