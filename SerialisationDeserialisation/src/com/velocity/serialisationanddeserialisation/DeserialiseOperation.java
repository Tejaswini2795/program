package com.velocity.serialisationanddeserialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialiseOperation {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\Downloads\\serialisedFile.txt");
		ObjectInputStream obj = new ObjectInputStream(file);
		Object o1 = obj.readObject();
		Object o2 = obj.readObject();
		Object o3 = obj.readObject();
		
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		Student s3 = (Student) o3;
		
		System.out.println("id: "+s1.getId()+", Name: "+s1.getName());
		System.out.println("id: "+s2.getId()+", Name: "+s2.getName());
		System.out.println("id: "+s3.getId()+", Name: "+s3.getName());
				
	}

}
