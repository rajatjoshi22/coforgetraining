package com.coforge.inher;
import static com.coforge.inher.Trial.*;
import static java.lang.System.out;
public class StaticDemo{
	static {
		System.out.println("static block one");
	}
public static void main(String[] args) {
	out.println("main");
	int sum=x+y;
	out.println("sum is :"+sum);
	greet();
	System.out.println("main");
}
}
