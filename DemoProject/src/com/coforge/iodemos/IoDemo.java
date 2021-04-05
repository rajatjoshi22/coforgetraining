package com.coforge.iodemos;
import java.io.*;
public class IoDemo {
public static void main(String[] args) {
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader bufr=new BufferedReader(ir);
	System.out.println("Enter data");
	char c;
	try {
		c=(char)bufr.read();
		do{
			System.out.print(c);
			c=(char)bufr.read();
		}while(c!='q');
		}catch(Exception e) {
			e.getStackTrace();
		}
	System.out.println("Completed");
}
}
