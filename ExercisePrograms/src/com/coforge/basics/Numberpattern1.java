package com.coforge.basics;

public class Numberpattern1 {
public static void main(String[] args) {
	int count=1;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(count+" ");
			count=count+1;
		}
		System.out.println();
	}
}
}
