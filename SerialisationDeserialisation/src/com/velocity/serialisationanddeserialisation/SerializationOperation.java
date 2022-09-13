package com.velocity.serialisationanddeserialisation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationOperation {

	
	public static void main(String[] args) throws IOException {
		Student s1 = new Student(1, "Akash");
		Student s2 = new Student(2, "Revati");
		Student s3 = new Student(3, "Vishal");
		System.out.println("Serialisation started");
		FileOutputStream file = new FileOutputStream("C:\\Users\\LENOVO\\Downloads\\serialisedFile.txt");
		ObjectOutputStream stream = new ObjectOutputStream(file);
		stream.writeObject(s1);
		stream.writeObject(s2);
		stream.writeObject(s3);
		System.out.println("Serialisation Completed");
		
		stream.flush();
		stream.close();
		file.close();

	}

}
