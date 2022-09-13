package com.assignment11;

import java.io.Serializable;

public class RestrictObjectCreation implements Cloneable, Serializable{
	private static RestrictObjectCreation restrictObjectCreation;
	//By declaring a constructor private we can not create object of this class from outside class
	private RestrictObjectCreation() {
		
	}
	
	//by calling following method we can get object of this class
	public static RestrictObjectCreation objectCreation() {
		if(restrictObjectCreation == null)
			restrictObjectCreation = new RestrictObjectCreation();
		return restrictObjectCreation;
	}

	//implementing cloneable interface it will restrict object creation using clone method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
