package com.coforge.basics;

import java.util.Scanner;

public class Twodarraysum {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int row, col, total = 0, avg = 0;
		System.out.println("Enter no of row");
		row = src.nextInt();
		System.out.println("Enter number of columns");
		col = src.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter values");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = src.nextInt();
			}
		}
		for (int[] row1 : arr) {
			for (int val : row1) {
				total = total + val;
			}
		}
		avg = total / (row * col);
		src.close();
		System.out.println("The sum of all the entries:" + total);
		System.out.println("The average is:" + avg);

	}

}

