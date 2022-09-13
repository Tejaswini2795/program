package com.thinkquetient.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class question1 {
	
	public static void main(String[] args) {
		LinkedList<Employee> ll1 = new LinkedList<>();
		Employee e1 = new Employee(1,"Tejas");
		Employee e2 = new Employee(2,"Mahesh");
		Employee e3 = new Employee(3,"Abhi");
		ll1.add(e1);
		ll1.add(e2);
		ll1.add(e3);
		
		//append specified element at end of Linked list
		ll1.addLast(e2);
		
		ll1.forEach( e -> System.out.println(e));
		
		//set Iterator at specified index
		Iterator<Employee>iterator = ll1.iterator();
		while(iterator.hasNext()) {
			Employee e4 = iterator.next();
			if(e4.getId()== 2)
				System.out.println(e4);
		}
	}

}
