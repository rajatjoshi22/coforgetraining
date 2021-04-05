package com.coforge.training;

public class Twodarray {
public static void main(String[] args) {
	int[][] marks=new int[2][2];
	marks[0][0]=12;
	marks[0][1]=15;
	marks[1][0]=24;
	marks[1][1]=45;
	for(int[] row:marks) {
		System.out.println();
		{
		for(int val:row)
			System.out.print(" "+val);
		}
	}
}
}
