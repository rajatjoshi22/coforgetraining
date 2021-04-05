package com.coforge.basics;
import java.util.Scanner;
public class Secondsmallest {
public static void main(String[] args) {
	int temp,count;
	System.out.println("Enter no of elements");
	Scanner src=new Scanner(System.in);
	count=src.nextInt();
	int[] arr=new int[count];
	System.out.println("Enter array elements");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=src.nextInt();
	}
	for (int i = 0; i < arr.length; i++)   
    {  
        for (int j = i + 1; j < arr.length; j++)   
        {  
            if (arr[i] > arr[j])   
            {  
                temp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = temp;  
            }  
        }  
    }  
	System.out.println("Second smallest element of the array: "+arr[1]);
	src.close();
}
}
