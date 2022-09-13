package com.velocity.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Example {
public static void main(String[] args) {
	Map<String, String> map =new HashMap<>();
	map.put("ram", "patil");
	map.put("Shyam", "Deshmukh");
	map.put("Praveen", "Bhosale");
	
	map.forEach((k,v)->System.out.println("Key: "+k+"  Value "+v));
}
}
