package com.coforge.def;

public class Customer implements Benefits,Coverage {

	@Override
	public void customBenefits() {
		// TODO Auto-generated method stub
   System.out.println("Customer Benefits");
	}

	@Override
	public void medIns() {
		// TODO Auto-generated method stub
		System.out.println("medical insurance for customer");
		Benefits.super.medIns();
		Coverage.super.medIns();
	}

	@Override
	public void customerBenefits() {
		// TODO Auto-generated method stub
		
	}

}
