package com.coforge.training;

public class Userinput {
public static void main(String[] args) {
	
	String name=args[0];
	int id=Integer.parseInt(args[1]);
	double salary=Double.parseDouble(args[2]);
	System.out.println(name+""+id+""+salary);
}
}
