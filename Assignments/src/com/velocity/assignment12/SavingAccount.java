package com.velocity.assignment12;

import java.util.Scanner;

public class SavingAccount extends Account{
	
	String accountType = "saving";
	long balance = 20000;
	static Scanner sc = new Scanner(System.in);
	Account account = new Account();
	
	/*
	 * public SavingAccount( long balance,String accountType) {
	 * 
	 * this.accountType = accountType; this.balance = balance; }
	 */
	
	public void getSavingAccountDetails() {
		System.out.println("Account Number: "+super.accountNumber);
		System.out.println("Account Name :"+super.accountName);
	}
	
	public void getSavingAccountInformation() {
		System.out.println("Account Number: "+super.accountNumber);
		System.out.println("Account Name :"+super.accountName);
		System.out.println("Account Type: "+accountType);
		System.out.println("Available Balance"+balance);
	}

}
