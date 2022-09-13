package com.velocity.filehandling.textfile;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFileOperations {
	
	//Reading data from file
	public static String ReadData() {
		
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\LENOVO\\Downloads\\Multithreading.pdf");
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Reading data from text file");
		ReadData();
		System.out.println("completed");

	}

}
