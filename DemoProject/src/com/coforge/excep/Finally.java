package com.coforge.excep;

public class Finally {
	public static void main(String[] args) {
		try {
				String value=args[0];
				System.out.println(value);
				int num=Integer.parseInt(value);
				System.out.println(num);
				int total=100/num;
				System.out.println(total);
//				int[] marks=null;
//				System.out.println(marks[2]);
				}
//		catch(Exception e) {
//			System.out.println(e);}

finally {
			System.out.println("In Finally block");
			System.out.println("closing resources");
		}
	}
}

