package com.assignments6;

import java.util.Scanner;

public class FactorialNo {
	static Scanner sc = new Scanner(System.in);
	public int factorialInt(int num) {
		int fact = 1;
		for(int i=num;i>0;i--) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		FactorialNo factorialNo = new FactorialNo();
		System.out.println("enter no");
		int num = sc.nextInt();
		System.out.println(factorialNo.factorialInt(num));
		
	}

}
