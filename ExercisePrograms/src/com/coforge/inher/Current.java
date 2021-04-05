package com.coforge.inher;

public class Current extends BankAccount {
	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance = balance - (1.1 * amount);
		System.out.println("Current withdraw done");

	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + (2 * amount);
		System.out.println("Current deposit done");

	}

}
