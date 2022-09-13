package com.excercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Excercise {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person(1, "charles", "xyz"),
				new Person(2, "Lewis", "Corroll"),
				new Person(31, "Thomas", "Coryn"),
				new Person(45,"Charlotte","Brante"),
				new Person(39,"Motthem","Arnold"));
		
		//Step 1: Sort list by last name
		//Java 7
		Collections.sort(people, (Person o1, Person o2) ->
				 o1.getLastName().compareTo(o2.getLastName()));
				
		System.out.println("==============print all==================");
		//create  a method print all elements in list
		printWithCondition(people, p -> true);
		
		System.out.println("==============print last name start with c==================");
		//print last name begin with letter c
		printWithCondition(people, p -> p.getLastName().startsWith("C"));
		
		
		System.out.println("===========print first name start with c===================");
		
		printWithCondition(people, p -> p.getFirstName().startsWith("c"));
		
		Comparable<T>
		
		
				
	}
	
	private static void printWithCondition(List<Person> people, Predicate<Person> condition) {
		for(Person p: people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
	}
	

}
}

