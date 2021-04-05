package com.coforge.basics;
import java.util.Scanner;
public class Ascendingorder {
	 public static void main(String[] args) 
	    {
	        int count, temp;
	        Scanner src = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        count = src.nextInt();
	        int arr[] = new int[count];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < count; i++) 
	        {
	            arr[i] = src.nextInt();
	        }
	        for (int i = 0; i < count; i++) 
	        {
	            for (int j = i + 1; j < count; j++) 
	            {
	                if (arr[i] > arr[j]) 
	                {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        System.out.print("Ascending Order:");
	        for (int i = 0; i < count; i++) 
	        {
	            System.out.print(arr[i]+"\t" );
	            
	        }
	        src.close();
	    }
}
