package com.coforge.basics;

import java.util.Scanner;

public class Smallestarray {
	public static void main(String[] args) {
		int min,count;
		System.out.println("Enter no of elements in array");
		Scanner src=new Scanner(System.in);
		count=src.nextInt();
		int[] arr=new int[count];
		System.out.println("Enter Elements in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=src.nextInt();
		}
		min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest Element of array: "+min);
		src.close();
	}

}
