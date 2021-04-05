package com.coforge.inher;
class Trial {
	static int x,y=20;
	static{
		x=10;
		System.out.println("Welcome to static block");
	}
	static{
		y=100;
		x=200;
		System.out.println("sum of numbers "+(x+y));
	}
	static void greet() {
		System.out.println("hello");
	}
}
