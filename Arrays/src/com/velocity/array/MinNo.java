package com.velocity.array;

import java.util.Scanner;

public class MinNo {

	public static void findMinNo(int arr[]) {
		int minNo = arr[0];
		for (int i : arr) {
			if (i < minNo)
				minNo = i;

		}
		System.out.println("Minimum no =" + minNo);
	}

	public static void findSecondLargest(int arr[]) {
		int max1 = arr[0];
		int max2 = arr[1];
		
		for (int i : arr) {
			
			if (i > max1) {
				max2 = max1;
				max1 = i;
			}
		}
		System.out.println("2nd largest no is:" + max2);
	}
	
	public static int[] arraySort(int arr[]) {
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println("]");
		findMinNo(arr);
		findSecondLargest(arr);
		int []arr1 = arraySort(arr);
		System.out.print("[");
		for (int i : arr1) {
			System.out.print(i+", ");
		}
		System.out.println("]");
				
	}

}
