package com.coforge.def;

public class DefDemo {
public static void main(String[] args) {
	Benefits ben=new Customer();
	ben.customBenefits();
	ben.medIns();
	ben=new Emp();
	ben.customBenefits();
	ben.medIns();
	Benefits.greet();
}
}
