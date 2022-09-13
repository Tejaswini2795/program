package com.velocity.microproject;

import java.util.Scanner;

public class NumberSystem {
	
	int num ;
	int remainder ;
	String convertedNo ;
	

	static Scanner sc = new Scanner(System.in);

	// Decimal to Binary conversion
	public void decToBinary(int decNum) {

		num = decNum;
		remainder = 0;
		convertedNo = "";

		// Converting decimal into binary
		while (num != 0) {
			remainder = num % 2;
			convertedNo += remainder;
			num = num / 2;
		}

		// reversing the obtained binary no. to get exact binary no.
		int length = convertedNo.length() - 1;
		System.out.print("Binary No: ");
		for (int i = length; i >= 0; i--) {
			System.out.print(convertedNo.charAt(length));
			length--;
		}
		System.out.println();
	}

	// Decimal to Octal conversion
	public void decToOctal(int decNum) {

		num = decNum;
		remainder = 0;
		convertedNo = "";

		// Converting decimal into binary
		while (num != 0) {

			remainder = num % 8;
			convertedNo += remainder;
			num = num / 8;
		}

		// reversing the obtained binary no to get exact binary no
		int length = convertedNo.length() - 1;
		System.out.print("Octal no: ");
		for (int i = length; i >= 0; i--) {
			System.out.print(convertedNo.charAt(length));
			length--;
		}
		System.out.println();
	}

	//Decimal to Hexadecimal 
	public void decToHexadec(int decNum) {

		num = decNum;
		remainder = 0;
		convertedNo = "";

		// Converting decimal into hexadecimal
		while (num != 0) {

			remainder = num % 16;
			if (remainder > 9) {
				String s = "";
				if (remainder == 10)
					s = "A";
				else if (remainder == 11)
					s = "B";
				else if (remainder == 12)
					s = "C";
				else if (remainder == 13)
					s = "D";
				else if (remainder == 14)
					s = "E";
				else if (remainder == 15)
					s = "F";

				convertedNo += s;
			} else
				convertedNo += remainder;
			num = num / 16;
		}
		// reversing the obtained decimal no to get exact hexadecimal no
		System.out.print("Hexadecimal No: ");
		int length = convertedNo.length() - 1;
		for (int i = length; i >= 0; i--) {
			System.out.print(convertedNo.charAt(length));
			length--;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		NumberSystem numberSystem = new NumberSystem();
		System.out.println("Enter decimal number");
		int decNum = sc.nextInt();
		numberSystem.decToBinary(decNum);
		numberSystem.decToOctal(decNum);
		numberSystem.decToHexadec(decNum);
	}

}
