package com.coforge.basics;
import java.util.Scanner;
public class EmployeeBonusrun {

	public static void main(String[] args) {
		double bonus1, bonus2, bonus3;
		String name1,designation1,name2,designation2,name3,designation3;
		Scanner src=new Scanner(System.in);
		System.out.println("Enter name");
		name1=src.next();
		System.out.println("Enter designation");
		designation1=src.next();
		EmployeeBonus employee1= new EmployeeBonus(name1,designation1);
		
		if (employee1.designation.equals("programmer")) {
			bonus1 = employee1.calcBonus(10000);
		} else if (employee1.designation.equals("manager")) {
			bonus1 = employee1.calcBonus(10000, 5000);
		} else {
			bonus1 = employee1.calcBonus(10000, 5000, 2000);
		}
		System.out.println("Enter name");
		name2=src.next();
		System.out.println("Enter designation");
		designation2=src.next();
EmployeeBonus employee2= new EmployeeBonus(name2,designation2);
		
		if (employee2.designation.equals("programmer")) {
			bonus2 = employee2.calcBonus(10000);
		} else if (employee2.designation.equals("manager")) {
			bonus2 = employee2.calcBonus(10000, 5000);
		} else {
			bonus2 = employee2.calcBonus(10000, 5000, 2000);
		}
		System.out.println("Enter name");
		name3=src.next();
		System.out.println("Enter designation");
		designation3=src.next();
EmployeeBonus employee3= new EmployeeBonus(name3,designation3);
		
		if (employee3.designation.equals("programmer")) {
			bonus3 = employee3.calcBonus(10000);
		} else if (employee3.designation.equals("manager")) {
			bonus3 = employee3.calcBonus(10000, 5000);
		} else {
			bonus3 = employee3.calcBonus(10000, 5000, 2000);
		}
		src.close();
		System.out.println("Bonus for " + employee1.name + " " + bonus1);
		System.out.println("Bonus for " + employee2.name + " " + bonus2);
		System.out.println("Bonus for " + employee3.name + " " + bonus3);
		

	}

}
