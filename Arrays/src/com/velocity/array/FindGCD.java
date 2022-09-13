package com.velocity.array;

import java.util.Scanner;

public class FindGCD {
	
	public static void findGCD1() {
		 int size = 0;
		    int arr[] = null;
		    int result = 0;
		    
		    // create Scanner class object to read input
		    Scanner scan = new Scanner(System.in);
		    
		    // read size
		    System.out.print("Enter total numbers: ");
		    size = scan.nextInt();
		    
		    // declare array
		    arr = new int[size];
		    
		    // read numbers
		    System.out.println("Enter numbers: ");
		    for(int i=0; i<size; i++) {
		      arr[i] = scan.nextInt();
		    }
		    
		    // assign first number to result
		    result = arr[0];
		    
		    // loop
		    for(int i=1; i<size; i++) {
		      result = findHCF(result, arr[i]);
		    }
		    
		    // display result
		    System.out.println("GCD = " + result);

		    // close Scanner
		    scan.close();
	}

		  // recursive method
		  public static int findHCF(int num1, int num2) {
		    while (num1 != num2) {
		      if (num1 > num2)
		        num1 = num1 - num2;
		      else
		        num2 = num2 - num1;
		    }
		    return num1;
		  }
		
	public static void main(String[] args) {
		findGCD1();
	}

}
