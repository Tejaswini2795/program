package com.assignment7;

public class CheckAlphaCharDigit {
	
	public void checkChar(char value) {
		if(value >=65 && value<=97) {
			System.out.println("its a alphabet");
		}
		else
			System.out.println("not a alphabet");
	}
	public static void main(String[] args) {
		CheckAlphaCharDigit check = new CheckAlphaCharDigit();
		check.checkChar('8');
				
	}

}
