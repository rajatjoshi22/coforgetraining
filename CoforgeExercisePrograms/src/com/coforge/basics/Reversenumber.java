package com.coforge.basics;
import java.util.Scanner;
public class Reversenumber {
public static void main(String[] args) {
	int number,reverse;
	reverse=0;
	Scanner src=new Scanner(System.in);
	System.out.println("Enter a number");
    number=src.nextInt();
    while(number!=0)
    {
    	int digit=number%10;
    	reverse=(reverse*10)+digit;
    	number=number/10;
    }
    System.out.println("Reverse of the number: "+reverse);
    src.close();
}
}
