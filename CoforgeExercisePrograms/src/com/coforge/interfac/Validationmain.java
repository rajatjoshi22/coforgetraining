package com.coforge.interfac;

import java.util.Scanner;

public class Validationmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		try {
			System.out.println("Enter your name");
			String name = src.next();
			Validation user = new Validation();
			boolean condition = user.checkUsername(name);
//		if (condition)
//			System.out.println("user already exist |type new name");
			if (condition ) {
				System.out.println("Registration successfull");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			src.close();
		}

	}

}
