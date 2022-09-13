package com.printstatement;

public class NoOfDigit {

	public void noOfDigit(int number) {
		int count = 0;
		while(number > 10)
		{
			count++;
			number = number/10;
		}
		System.out.println("noOfDigit:"+(count+1));

	}
	public static void main(String[] args) {
		NoOfDigit noOfDigit1 = new NoOfDigit();
		noOfDigit1.noOfDigit(23045  );
	}
}
