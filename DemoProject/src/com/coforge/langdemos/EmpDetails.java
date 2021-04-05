package com.coforge.langdemos;

public class EmpDetails {
void showBonus(String name,String desg,BonusCalculator c,int amount) {
	System.out.println("Welcome "+name);
	System.out.println("Bonus for you is: "+c.calculateBonus(amount));
}
}
