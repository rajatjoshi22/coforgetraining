package com.coforge.langdemos;

public class EmployeeMain {
public static void main(String[] args) {
	EmpDetails employee=new EmpDetails();
	employee.showBonus("Rajat", "Manager",
			(int amount)->{
				System.out.println("Bonus for manager");
				return (amount)*2/3;
				
			}, 20000);
	employee.showBonus("Rohan", "programmer",
			(int amount)->{
				System.out.println("Bonus for programmer");
				return (amount)*4/3;
				
			}, 20000);
	employee.showBonus("Raj", "Director",
			(int amount)->{
				System.out.println("Bonus for Director");
				return (amount)*5/3;
				
			}, 20000);
	
}
}
