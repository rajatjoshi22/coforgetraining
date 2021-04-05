package com.coforge.basics;

public class Armstrong {
public static void main(String[] args) {
	int rem,n,total=0,a;
	n=145;
	a=n;
	while(n!=0)
	{
		rem=n%10;
		total=total+(rem*rem*rem);
		n=n/10;
		
	}
	if(total==a)
	{
		System.out.println("Armstrong number");
	}
	else {
		System.out.println("not a armstrong number");
	}
}
}
