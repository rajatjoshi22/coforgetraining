package com.coforge.training;

public class DynamicInitialization {
public static void main(String[] args) {
	int[][] marks=new int[4][];
	marks[0]=new int[2];
	marks[1]=new int[3];
	marks[2]=new int[4];
//	marks[3]=new int[5]; null pointer error if not initialized
	marks[0][0]=45;
	marks[1][0]=37;
	marks[2][0]=67;
//	marks[3][0]=78; cant not give value without initialization
	for(int[] mark:marks)
	{
		System.out.println();
		for(int val:mark)
		{
			System.out.print(" "+val);
		}
	}
}
}
