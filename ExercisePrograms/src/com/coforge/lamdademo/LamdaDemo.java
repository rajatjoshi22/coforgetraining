package com.coforge.lamdademo;

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = (num1, num2) -> System.out.println("Addition is :" + (num1+ num2));
		cal.calculate(10, 5);
		cal = (num1, num2) -> System.out.println("Subtraction is :" + (num1- num2));
		cal.calculate(5, 2);
		cal = (num1, num2) -> System.out.println("Multiplication is: " + (num1 * num2));
		cal.calculate(15, 3);
		cal = (num1, num2) -> System.out.println("Divided result is: " + (num1 / num2));
		cal.calculate(10, 5);
	}

}
