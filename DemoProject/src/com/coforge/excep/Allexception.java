package com.coforge.excep;

public class Allexception {
public static void main(String[] args) {
	try {
		String value=args[0];
		System.out.println(value);
		int num=Integer.parseInt(value);
		System.out.println(num);
		int total=100/num;
		System.out.println(total);
		int[] marks=null;
		System.out.println(marks[2]);
		}
	catch(ArrayIndexOutOfBoundsException |NumberFormatException | ArithmeticException e) {
		System.out.println(e.getStackTrace());
	}
}
}
