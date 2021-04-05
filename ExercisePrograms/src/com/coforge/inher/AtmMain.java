package com.coforge.inher;

import java.util.Scanner;

public class AtmMain {
	public static void main(String[] args) {
		String choice;
		String transaction;
		Scanner src = new Scanner(System.in);
		System.out.println("Welcome to Atm");
		System.out.println("Enter your choice savings| current");
		choice = src.next();
		BankAccount account = null;
		switch (choice) {
		case "savings":
			account = new Savings(500000);
			System.out.println("Enter your choice withdraw | deposit");
			transaction = src.next();
			if (transaction.equals("withdraw")) {
				account.withdraw(12000);
				System.out.println("Balance After withdrawal :" + account.getBalance());
			} else if (transaction.equals("deposit")) {
				account.deposit(14000);
				System.out.println("Balance after deposit :" + account.getBalance());
			} else {
				System.out.println("Account balance :" + account.getBalance());
			}
			break;
		case "current":

			account = new Current(400000);
			System.out.println("Enter your choice withdraw | deposit");
			transaction = src.next();
			if (transaction.equals("withdraw")) {
				account.withdraw(12000);
				System.out.println("Balance After withdrawal :" + account.getBalance());
			} else if (transaction.equals("deposit")) {
				account.deposit(14000);
				System.out.println("Balance after deposit :" + account.getBalance());
			} else {
				System.out.println("Account balance :" + account.getBalance());
			}
			break;
		default:
			System.out.println("Wrong Input try again!");

		}
		System.out.println("Thanku for using our Atm");
		src.close();
//		double balance;
//
//		Scanner src = new Scanner(System.in);
//		String option = "continue";
//		System.out.println("Enter account type");
//		String accounttype = src.next();
//		String choice;
//		int withdraw, deposit;
//		switch (accounttype) {
//		case "Savings":
//
//			BankAccount savings = new Savings(500000);
//
//			while (option.equals("continue")) {
//				System.out.println("select withdraw | deposit | getbalance ");
//				choice = src.next();
//				if (choice.equals("withdraw")) {
//					System.out.println("Enter amount to withdraw");
//					withdraw = src.nextInt();
//					savings.withdraw(withdraw);
//
//				} else if (choice.equals("deposit")) {
//					System.out.println("Enter amount to deposit");
//					deposit = src.nextInt();
//					savings.deposit(deposit);
//
//				} else {
//					balance = savings.getBalance();
//					System.out.println("Your account balance is :" + balance);
//				}
//
//				System.out.println("You want to continue or exit");
//				option = src.next();
//
//			}
//			break;
//		case "Current":
//
//			BankAccount current = new Current(50000);
//			while (option.equals("continue")) {
//				System.out.println("select withdraw | deposit | getbalance ");
//				choice = src.next();
//				if (choice.equals("withdraw")) {
//					System.out.println("Enter amount to withdraw");
//					withdraw = src.nextInt();
//					current.withdraw(withdraw);
//					System.out.println(current.getBalance());
//				} else if (choice.equals("deposit")) {
//					System.out.println("Enter amount to deposit");
//					deposit = src.nextInt();
//					current.deposit(deposit);
//					System.out.println(current.getBalance());
//				} else {
//					balance = current.getBalance();
//					System.out.println("Your account balance is :" + balance);
//				}
//				System.out.println("You want to continue or exit");
//				option = src.next();
//
//			}
//			break;
//
//		default:
//			System.out.println("Wrong selection");
//		}
//		System.out.println("Thanku for using Atm");
//		src.close();
	}
}
