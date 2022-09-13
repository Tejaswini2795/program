package com.velocity.assignment12;

public class Account {
	
	int accountNumber = 12345678;
	String accountName = "Tejaswini Tiwari";
	
	/*
	 * Account(int accountNumber, String accountName){ this.accountNumber =
	 * accountNumber; this.accountName = accountName; }
	 */
	
	public void getAccountDetails() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Name :"+accountName);
	}
	
	public void getAccountInformation() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Name :"+accountName);
	}

	public static void getSavingAccountDetails(int a) {
		System.out.println("Account Number: ");
		System.out.println("Account Name :");
	}
}
