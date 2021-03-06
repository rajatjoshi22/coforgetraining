package com.coforge.exception;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, password;
		boolean condition;
		Scanner src = new Scanner(System.in);
		try {
			Validation user = new Validation();
			System.out.println("Enter name");
			name = src.next();
			condition = user.checkName(name);
			if (condition) {
				System.out.println("Enter password");
				password = src.next();
				condition = user.checkPassword(password);
				
				if (condition) {
					System.out.println("User successfully register");
				}
			}
		} catch (NameExistsException e) {
			System.out.println(e.getMessage());
		} catch (TooLongException e) {
			System.out.println(e.getMessage());
		} catch (TooShortException e) {
			System.out.println(e.getMessage());
		} finally {
			src.close();
		}
	}

}
