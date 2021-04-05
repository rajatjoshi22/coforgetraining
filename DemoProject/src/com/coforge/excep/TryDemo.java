package com.coforge.excep;

public class TryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int x=10/0;
//       System.out.println(x);
		System.out.println("Welcome");
		try {
		String value=args[0];
		System.out.println(value);
		int num=Integer.parseInt(value);
		System.out.println(num);
		int total=100/num;
		System.out.println(total);
		int[] marks=null;
		System.out.println(marks[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Enter a value");
		}
		catch(ArithmeticException e) {
			System.out.println("please Enter a number greater than 0");
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter a number ");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
