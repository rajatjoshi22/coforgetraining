package com.coforge.basics;
import java.util.Scanner;
public class Perfectno {
public static void main(String[] args) {
	int sum;
	Scanner src=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=src.nextInt();
	sum=0;
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==num)
	{
		System.out.println("Perfect Number");
	}
	else
	{
		System.out.println("Not a prefect number");
	}
	src.close();
}
}
