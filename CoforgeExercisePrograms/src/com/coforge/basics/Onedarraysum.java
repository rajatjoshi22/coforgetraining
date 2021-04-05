package com.coforge.basics;
import java.util.Scanner;
public class Onedarraysum {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter no of entries");
		int count,total=0,avg=0;
		count=src.nextInt();
		int[] arr=new int[count];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=src.nextInt();
			
		}
		for(int val:arr)
		{
			total=total+val;
		}
		avg=total/count;
		src.close();
		System.out.println("The sum of all the entries:"+total);
		System.out.println("The average is:"+avg);
		
	}

}
