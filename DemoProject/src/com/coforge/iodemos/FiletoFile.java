package com.coforge.iodemos;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class FiletoFile {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {

			fr = new FileReader("sample.txt");
			fw = new FileWriter("sample1.txt");

			int i;
			char c;
			while ((i = fr.read()) != -1) {
				System.out.println("File reading :" + (char) i);
				c = (char) i;
				fw.write(c);
			}

		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
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
