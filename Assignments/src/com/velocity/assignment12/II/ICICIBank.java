package com.velocity.assignment12.II;

import java.util.Scanner;

public class ICICIBank extends Bank {

	public void getICICIBankDetails() {
		Scanner scanner = new Scanner(System.in);
		// To get user input for ICICI bank
		System.out.println("Enter the details for ICICI bank>>");
		System.out.println("Principal Amount>>");
		principleAmount = scanner.nextDouble();
		System.out.println("Tenure>>");
		tenure = scanner.nextInt();
		System.out.println("Rate of Interest>>");
		rateOfInterest = scanner.nextFloat();
		System.out.println(

				"Simple interest for ICICI bank>> " + getCalculateInterest(principleAmount, tenure, rateOfInterest));
	}

	private double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {

		return ((principleAmount * tenure * rateOfInterest) / 100);
	}
}
