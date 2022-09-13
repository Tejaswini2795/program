package com.velocity.assignment12.II;

public class Main {
	public static void main(String[] args) {

		ICICIBank iciciBank = new ICICIBank();
		iciciBank.getICICIBankDetails();
		HDFCBank hdfcBank = new HDFCBank();
		hdfcBank.getHDFCDetails();
		SBIBank sbiBank = new SBIBank();
		sbiBank.getSBIDetails();
	}

}
