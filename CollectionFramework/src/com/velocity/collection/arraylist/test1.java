package com.velocity.collection.arraylist;

import java.util.ArrayList;

public class test1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("Tejaswini");
		al.add("Tiwari");
		al.add(27);
		al.add("F");
		
		al.forEach(v -> System.out.println(v));
	}

}
