package com.velocity.collection.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(101, "Sachin");
		hashMap.put(102, "Ramesh");
		
		System.out.println("printing hash map");
		hashMap.forEach((k,v) -> System.out.println("Keys: "+k+" value: "+v));
//		Set<Integer> keySet = hashMap.keySet();
//		for(int i : keySet) {
//			System.out.println("Keys: "+i);
//			System.out.println("values:"+hashMap.get(i));
//			
//		}
		//System.out.println(hashMap);
		
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("MM University", "ABCCollege");
		linkedHashMap.put("LAtur University", "Dayanand College");
		linkedHashMap.put("Dhoki University", "Dayanand College");
		linkedHashMap.put("LAtur University", "Dayanand College");
		linkedHashMap.forEach((l,m) -> System.out.println("Keys: "+l+" values: "+m));
//		Set<String> keySet2 = linkedHashMap.keySet();
//		Iterator<String> iterator = keySet2.iterator();
//		while(iterator.hasNext()) {
//			String key = iterator.next();
//			System.out.println("Keys:"+key);
//			System.out.println("Value:"+linkedHashMap.get(key));
//		}
//		System.out.println(linkedHashMap);
		
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(79, "Praveen");

		hashtable.put(67, "hello");
		hashtable.put(78, "Naveen");

		System.out.println("Hash table");
		hashtable.forEach((k,v) -> System.out.println("keys: "+k+" values: "+v));
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(200, "Apple");
		map.put(11, "Microsoft");
		map.put(11, "Microsoft");
		
		System.out.println("tree map");
		map.forEach((k,v) -> System.out.println("keys: "+k+" values: "+v));

	}

}
