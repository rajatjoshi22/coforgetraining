package com.coforge.basics;

public class Primeno {
public static void main(String[] args) {
	int i,n,count=0;
	n=11;
	for(i=2;i<n/2;i++)
	{
		if(n%i==0)
		{
			System.out.println("Not a prime number");
			count++;
			break;
		}
	}
	if(count==0)
	{
		System.out.println("Prime no");
	}
}
}
