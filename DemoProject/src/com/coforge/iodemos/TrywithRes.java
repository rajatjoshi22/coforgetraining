package com.coforge.iodemos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class TrywithRes {
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader bufr = new BufferedReader(ir);
		

		System.out.println("Enter data");
		char c;
		try(FileWriter fw=new FileWriter("sample.txt");) {
			 

			c = (char) bufr.read();
			do {
				System.out.print(c);
				fw.write(c);
				c = (char) bufr.read();
			} while (c != 'q');

		} catch (IOException e) {
			e.getStackTrace();
		} 
		System.out.println("Completed");
		}
		
	}

