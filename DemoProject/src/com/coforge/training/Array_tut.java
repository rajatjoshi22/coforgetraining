package com.coforge.training;

public class Array_tut {
    public static void main(String[] args) {
		int[] marks=new int[5];
//		System.out.println(marks[3]);
		marks[0]=12;
		marks[1]=45;
		marks[2]=19;
		marks[3]=789;
		marks[4]=4589;
//		int sum=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
//		System.out.println(sum);
//		System.out.println(marks[4]);
		int sum=0;
		for (int mark:marks)
		{
			sum+=mark;
		}
		System.out.println(sum);
	}
}
