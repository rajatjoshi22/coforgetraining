package com.coforge.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialStud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Rajat", 12345, "cricket");
		System.out.println(student);

		try (FileOutputStream fs = new FileOutputStream("stud2.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs);) {

			os.writeObject(student);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}


