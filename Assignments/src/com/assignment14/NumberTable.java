package com.assignment14;

public class NumberTable {
	
	public static void tableLogic() {
		for (int i = 1; i<=20; i++) {
			for(int j = 1; j<=10; j++) {
				int result = i*j;
				System.out.print(result+"   ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		tableLogic();
	}

}
