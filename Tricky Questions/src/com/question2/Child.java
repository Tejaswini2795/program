package com.question2;
class Parent
{
	public void getInfo() {
		System.out.println("Parent class");
	}
}
public class Child extends Parent{
	
	public int getInfo(String val) {
		System.out.println("Child class");
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.getInfo();
	}

}
