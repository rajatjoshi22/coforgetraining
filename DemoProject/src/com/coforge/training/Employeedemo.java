package com.coforge.training;

public class Employeedemo {
	public static void main(String[] args) {
		Employee emp=new Employee("rajat",123,12000);
		
		Employee emp2=new Employee("Joshi",678,45000);
		
		Employee emp3;
		emp3=emp2;
        emp.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}
}
