package com.coforge.excep;

import java.util.Scanner;

public class Bankrun {
	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner src = new Scanner(System.in);
		int amount;
		System.out.println("Enter your amount");
		amount = src.nextInt();
		try {

			Bank bank = new Bank(9000);
			bank.withdraw(amount);
			System.out.println("Amount Withdraw Successfull");
		} catch (OutOfLimitException e) {
			System.out.println(e.getMessage());
		} catch (NegativeBalanceException e) {
			System.out.println(e.getMessage());
		} finally {
			src.close();
		}
		System.out.println("Good bye");

	}
}
