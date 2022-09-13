package com.assignment7;

import java.util.Scanner;

public class CubeReverseFact {
	static Scanner sc = new Scanner(System.in);
	// Cube of NUmber
	public int getNumberCube(int num) {
		int cube = num * num * num;
		return cube;
	}

	// print factors of given number
	public void printFactors(int num) {
		System.out.print("factors of "+num+" is:");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i);
			if(i!=num && num % i == 0)
				System.out.print(", ");
		}
		System.out.println();
	}

	// print reverse number
	public String getReverseNumber(int num) {

		String reverseNum = "";
		while (num != 0) {
			int remainder = num % 10;
			num = num / 10;
			reverseNum = reverseNum + remainder;
		}
		return reverseNum;
	}
	
	public static void main(String[] args) {
		CubeReverseFact cubeReverseFact = new CubeReverseFact();
		
		System.out.println("Enter number to find cube");
		int num = sc.nextInt();
		System.out.println("cube of "+num+" is:"+cubeReverseFact.getNumberCube(num));
		
		System.out.println("Enter number to get factors");
		int num1 = sc.nextInt();
		cubeReverseFact.printFactors(num1);
		
		System.out.println("enter number to find reverse of it");
		int num2 = sc.nextInt();
		System.out.println("reverse of "+num2+" is:"+cubeReverseFact.getReverseNumber(num2));
	}

}
