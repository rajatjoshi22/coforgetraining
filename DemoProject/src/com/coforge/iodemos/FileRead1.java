package com.coforge.iodemos;

import java.io.IOException;

import java.io.FileReader;

public class FileRead1 {
	public static void main(String[] args) {
		FileReader fr = null;
		System.out.println("Enter data");

		try {

			fr = new FileReader("sample.txt");

			int i;
			while ((i = fr.read()) != -1)
				System.out.println("File read: "+(char) i);
			
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			try {

				if (fr != null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Completed");
	}
}
