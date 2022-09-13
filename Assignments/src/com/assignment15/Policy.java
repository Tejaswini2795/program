package com.assignment15;

import java.util.Scanner;

public class Policy {
	 int policyId;
	 String policyName;
	 String policyType;
	 int premiumAmount;
	 static Policy p1;
	
	
	public Policy(int policyId, String policyName, String policyType, int premiumAmount) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyType = policyType;
		this.premiumAmount = premiumAmount;
	}


	public static Policy getPolicyDetails() {
			System.out.println(p1.toString());
			
			return p1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter policy name");
		String policyName = sc.next();
		System.out.println("Enter policy type");
		String policyType = sc.next();
		System.out.println("Enter premium Amount");
		int premiumAmount = sc.nextInt();
		
		p1 = new Policy(id, policyName, policyType, premiumAmount);
		getPolicyDetails();
		sc.close();
	}


	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", premiumAmount=" + premiumAmount + "]";
	}

}
