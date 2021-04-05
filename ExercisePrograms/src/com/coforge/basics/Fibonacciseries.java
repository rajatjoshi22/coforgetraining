package com.coforge.basics;
import java.util.Scanner;
public class Fibonacciseries {
	public static void main(String args[])  
	{    
	 int term1=0,term2=1,term3,i,count;
	 Scanner src=new Scanner(System.in);
	 System.out.println("Enter number of terms");
	 count=src.nextInt();
	 System.out.print(term1+" "+term2);  
	 src.close();   
	 for(i=2;i<count;++i)
	 {
	  term3=term1+term2;    
	  System.out.print(" "+term3);    
	  term1=term2;    
	  term2=term3;    
	 }
	
	}
	}

