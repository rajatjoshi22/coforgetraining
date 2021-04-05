package com.coforge.interface2;

public class BasicCalculator implements Calculator {

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		int sum = x + y;
		System.out.println("addition is :" + sum);

	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		int pro = x * y;
		System.out.println("product is: " + pro);
	}

	@Override
	public void difference(int x, int y) {
		// TODO Auto-generated method stub
		int diff = x - y;
		System.out.println("Difference is: " + diff);

	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
		int div = x / y;
		System.out.println("Divided result is: " + div);
	}

}
