package com.velocity.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatch {
	Scanner sc = new Scanner(System.in);
	int num1;
	int num2;
	int result;
	public void tryCatchBlock() {
		try {

			try {
				// Statement 1
				System.out.println("Enter two no");

				num1 = sc.nextInt();
				num2 = sc.nextInt();
				// Statement 2
				System.out.println("given numbers are num1:" + num1 + " num2: " + num2);
				System.out.println("================================================");

				try {

					result = num1 / num2;
					// Statement 3
					System.out.println("Result: " + result);
					System.out.println("================================================");

				} catch (ArithmeticException e) {
					// Statement 4
					System.out.println("Please enter number greater than zero");
					e.printStackTrace();
				}
			} catch (InputMismatchException e) {
				// Statement 5
				System.out.println("Please enter valid input");
				e.printStackTrace();
			}
		} catch (Exception e) {
			// Statement 6
			e.printStackTrace();
		}
		System.out.println("Out of try block");
	}

	public static void main(String[] args) {
		NestedTryCatch ns = new NestedTryCatch();
		ns.tryCatchBlock();

	}

}
