package com.coforge.iodemos;
import java.io.*;
public class ReadLine {
public static void main(String[] args) {
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader bufr=new BufferedReader(ir);
	System.out.println("Enter data");
	String str;
	try {
		str=bufr.readLine();
		do{
			System.out.println(str);
			str=bufr.readLine();
		}while(!str.equals("quit"));
		}catch(Exception e) {
			e.getStackTrace();
		}
	System.out.println("Completed");
}
}
