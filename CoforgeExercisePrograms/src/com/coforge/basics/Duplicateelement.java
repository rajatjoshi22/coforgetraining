package com.coforge.basics;
import java.util.Scanner;
public class Duplicateelement {
	public static void main(String[] args) {      
        Scanner src=new Scanner(System.in);
        int count;
        System.out.println("Enter no of elements in array");
        count=src.nextInt();
        int [] arr = new int [count] ;
        System.out.println("Enter array Elements");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=src.nextInt();
        }
          System.out.println("Duplicate elements in given array: ");  
       
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
        src.close();
    }  
}
