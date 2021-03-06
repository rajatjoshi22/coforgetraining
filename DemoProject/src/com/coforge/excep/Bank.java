package com.coforge.excep;

public class Bank {
	int balance ;
	
	public Bank(int balance) {
		super();
		this.balance = balance;
	}

	void withdraw(int amount) throws OutOfLimitException, NegativeBalanceException {
		
		try {
			if (amount > 5000) {
				throw new OutOfLimitException("Amount should be less than 5000");
			} else if ((balance - amount) <= 0) {
				throw new NegativeBalanceException("Balance is in negative");
			} else {
				balance = balance - amount;
				System.out.println("balance after withdrawal is: " + balance);
			}
		} catch (OutOfLimitException e) {
			System.out.println("Server side out of limit exception");
			throw e;
		} catch (NegativeBalanceException e) {
			System.out.println("Server side negative balance exception");
			throw e;
		}
	}
}