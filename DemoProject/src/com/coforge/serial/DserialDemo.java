package com.coforge.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DserialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   FileInputStream fo=null;
   ObjectInputStream os=null;
try {
	fo = new  FileInputStream("stud2.ser");
	   os=new ObjectInputStream(fo);
	   Student stud=(Student)os.readObject();
	   System.out.println(stud);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally{
	if(fo!=null ||os!=null) {
		
		try {
			os.close();
			fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
   
	}

}
