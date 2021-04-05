package com.coforge.basics;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		int a,b,c;
		Scanner src=new Scanner(System.in);
//		a=15;
//		b=123;
//		c=345;
		System.out.println("Enter a");
		a=src.nextInt();
		System.out.println("Enter b");
		b=src.nextInt();
		System.out.println("Enter c");
		c=src.nextInt();
		
		double d =a+b+c;
		System.out.println(d);
		src.close();
		
	}
}
