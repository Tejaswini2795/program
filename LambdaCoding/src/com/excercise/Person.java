package com.excercise;

public class Person {
	private int name;
	private String firstName;
	private String lastName;
	
	public Person(int name, String firstName, String lastName) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
