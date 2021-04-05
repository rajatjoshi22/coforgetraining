package com.coforge.inher;

public class Savings extends BankAccount {
	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Savings withdraw done");

	}

	@Override
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Savings deposit done");

	}

}
