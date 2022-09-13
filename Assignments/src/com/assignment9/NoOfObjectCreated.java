package com.assignment9;

public class NoOfObjectCreated {
	static int count=0;
	 NoOfObjectCreated() {
		count++;
	}
	public static void main(String[] args) {
		NoOfObjectCreated noOfObject = new NoOfObjectCreated();
		NoOfObjectCreated noOfObject1 = new NoOfObjectCreated();
		NoOfObjectCreated noOfObject2 = new NoOfObjectCreated();

		System.out.println("No of total object: "+count);
	}

}
