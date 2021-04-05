package com.coforge.inher;

public abstract class Bank {
	final static int discount;
	static {
		discount=12000;
	}
abstract void carLoan();
abstract void homeLoan();
abstract void educationalLoan();
void admin() {
	System.out.println("Admin Detatils");
}

}
