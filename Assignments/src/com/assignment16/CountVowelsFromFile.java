package com.assignment16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountVowelsFromFile {
	public static void main(String[] args) throws IOException {
		File file;
		String []words = null;
		try {
			 file = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\abc.txt");
			 BufferedReader br = new BufferedReader(new FileReader(file));
			 String s;
			 int flag = 0;
			 while((s=br.readLine())!=null) {
				 words = s.split("");
				 for(int i=0;i<words.length;i++) {
					 for(int j=0;j<words[i].length();j++) {
						 char ch = words[i].charAt(j);
					 }
				 }
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
