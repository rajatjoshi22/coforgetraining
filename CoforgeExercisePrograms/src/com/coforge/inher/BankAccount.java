package com.coforge.inher;

abstract class BankAccount {
	double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	abstract void withdraw(double amount);

	abstract void deposit(double amount);

	double getBalance() {
		return balance;
	}
}
