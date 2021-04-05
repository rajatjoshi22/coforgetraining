package com.coforge.interface2;

public class ScienCalculator extends BasicCalculator implements ScientificCalculator {

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
     int cube=(x*x*x);
     System.out.println("cube of the number :"+cube );
	}

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
     int squ=(x*x);
     System.out.println("square of the number :" +squ);
	}

}
