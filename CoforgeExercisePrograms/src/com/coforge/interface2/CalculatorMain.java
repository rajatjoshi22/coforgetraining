package com.coforge.interface2;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new ScienCalculator();
		calculator.add(15, 20);
		calculator.difference(25, 20);
		calculator.product(15, 3);
		calculator.divide(10, 5);
		ScientificCalculator scal = (ScientificCalculator) calculator;
		scal.cube(4);
		scal.square(5);
		scal.description();
	}

}
