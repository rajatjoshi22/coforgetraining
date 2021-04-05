package com.coforge.training;
import java.util.Scanner;
public class Scannerinput {
public static void main(String[] args) {
	int a,b,c;
	String str;
	Scanner src=new Scanner(System.in);
	a=src.nextInt();
	b=src.nextInt();
	src.nextLine();
	str=src.nextLine();
	src.close();
	c=a+b;
	System.out.println(c);
	
	System.out.println(str);
	
}
}
