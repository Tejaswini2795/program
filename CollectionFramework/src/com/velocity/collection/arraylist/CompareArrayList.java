package com.velocity.collection.arraylist;

import java.util.Hashtable;
import java.util.TreeMap;

public class CompareArrayList {
public static void main(String[] args) {
	 String s = "Love Java Programming";
	   String str = new String("Love Java Programming");
	   boolean compare = s.equals(str);
	   System.out.print(compare);
	   System.out.println();
	   System.out.println(s.hashCode());
	   System.out.println(str.hashCode());  
}
}
