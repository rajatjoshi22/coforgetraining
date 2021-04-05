package com.coforge.inher;

public class MainBank {
public static void main(String[] args) {
	Bank branch1=new Branch1();
	branch1.carLoan();
	branch1.educationalLoan();
	branch1.homeLoan();
	Branch1 bran=(Branch1)branch1;
	bran.admin();
	Branch2 branch2=new SubBranch();
	branch2.carLoan();
	branch2.educationalLoan();
	branch2.admin();
	branch2.checkDeposit();
	SubBranch sub=(SubBranch)branch2;
	sub.educationalLoan();
	sub.statuscheck();
	System.out.println(branch1.discount);
}
}
