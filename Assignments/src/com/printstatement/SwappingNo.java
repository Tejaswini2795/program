package com.printstatement;

public class SwappingNo {
	
	public void swapNo(int num1, int num2) {
		System.out.println("Before swap");
		System.out.println("value of num1: "+num1+" num2: "+num2);
		/*
		 * int num3 = num1; num1 = num2; num2 = num3;
		 */
		
		num2 = num1 + num2;
		num1 = num2-num1;
		num2 = num2 - num1;
		System.out.println("After swap");
		System.out.println("value of num1: "+num1+" num2: "+num2);
	}
	public static void main(String[] args) {
		SwappingNo swappingNo = new SwappingNo();
		swappingNo.swapNo(30, 40);
	}

}
