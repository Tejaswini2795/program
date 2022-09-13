package com.velocity.collection.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class StudentTest {
	
	public static void addStudent() {
		
	}
	public static List<Student> filter(List<Student> stud, Comparable<Student> studObj){
		List<Student> result = new ArrayList<Student>();
		
		for(Student stud1 : stud)
			if(studObj.compareTo(stud1))
				result.add(stud1);
		return result;
	}
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(167,"ABhijeet",25));
		studentList.add(new Student(622,"Jeet",15));
		studentList.add(new Student(983,"Abhi",28));
		studentList.add(new Student(109,"Abhij",75));
		studentList.add(new Student(123,"Jeetu",25));
		
		studentList.forEach(list -> System.out.println(list));
		
		Collections.sort(studentList,(s1,s2) ->s1.getAge().compareTo(s2.getAge()) );

		
		
		
	}

}
