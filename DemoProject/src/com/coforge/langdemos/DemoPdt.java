package com.coforge.langdemos;

public class DemoPdt {
public static void main(String[] args) {
	int y=Integer.parseInt("55");//string to primitive
	Integer x=y;//auto boxing
	int z=x*2;//auto unboxing
	System.out.println(z);
	Integer a=Integer.valueOf("23454");
	System.out.println(a);
	String s1=Integer.toBinaryString(8);
	System.out.println(s1);
	s1=Integer.toOctalString(8);
	System.out.println(s1);
	Integer num3=20;
	Object num4=num3*2;
	long num5=(long)num4;
	System.out.println(num5);
}
}
