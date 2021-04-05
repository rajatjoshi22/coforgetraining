package com.coforge.basics;

public class EmployeeBonus {
	String name;
	String designation;
	double totalamt;

	public EmployeeBonus(String name, String designation) {
		this.name = name;
		this.designation = designation;

	}

	public double calcBonus(double basicAllowance) {
		totalamt = basicAllowance;
		return totalamt;
	}

public double calcBonus(double basicAllowance,double carAllowance)
{
	totalamt=basicAllowance+carAllowance;
	return totalamt;
}

public double calcBonus(double basicAllowance,double carAllowance,double houseAllowance)
{ 
	totalamt=basicAllowance+carAllowance+houseAllowance;
	return totalamt;
}

}
