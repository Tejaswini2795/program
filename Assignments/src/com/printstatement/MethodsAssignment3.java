package com.printstatement;

public class MethodsAssignment3 {
	
	public String getStudentName(String name) {
		String studentName = name;
		return studentName;
	}
	public static void main(String[] args) {
		MethodsAssignment3 methodsAssignment3 = new MethodsAssignment3();
		System.out.println("Student Name: "+methodsAssignment3.getStudentName("Tejaswini"));
		System.out.println("Addition of two no:"+methodsAssignment3.addTwoNo(10,20));
		System.out.println("Subtraction of two no:"+methodsAssignment3.subTwoNo(10,20));
		System.out.println("Multiplication of two no:"+methodsAssignment3.multTwoNo(10,20));
		System.out.println("Division of two no:"+methodsAssignment3.divTwoNo(10,20));
		System.out.println("Average of five sub marks:"+methodsAssignment3.avgMarks(80, 75, 46, 55, 60));

	}
	
	//Assignment4
	//Q1
	//Addition of two no
	public int addTwoNo(int num1,int num2) {
		int add = num1 + num2;
		return add;
	}
	
	//Subtraction of two no
	public int subTwoNo(int num1,int num2) {
		int sub = num1 - num2;
		return sub;
	}
	
	//Multiplication of two no
	public int multTwoNo(int num1,int num2) {
		int mult = num1 * num2;
		return mult;
	}
	
	//Division of two no
	public int divTwoNo(int num1,int num2) {
		int div = num1 / num2;
		return div;
	}
	
	public float avgMarks(int sub1Marks, int sub2Marks, int sub3Marks, int sub4Marks, int sub5Marks) {
		int totalMarks = sub1Marks + sub2Marks + sub3Marks + sub4Marks + sub5Marks;
		float avgMarks = totalMarks / 5;		
		return avgMarks;
		
	}

}
