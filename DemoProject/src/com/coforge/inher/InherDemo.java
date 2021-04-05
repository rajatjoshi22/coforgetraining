package com.coforge.inher;
import java.util.Scanner;
class InEmployee {
	String name;
	int empId;

	public InEmployee(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}

	void getDetails() {
		System.out.println(name + " " + empId);
	}
	public void calcBonus(int amount)
	{
		System.out.println("Employee Bonus: "+amount);
	}
}

class InManager extends InEmployee {
	int salary;
 public InManager(String name,int empId,int salary) {
	 super(name,empId);
	 this.salary=salary;
	
 }
	void greetMessage() {
		 
		System.out.println("Have a great day");
	}
	public void calcBonus(int amount) {
		System.out.println("Bonus for manager: "+2*amount);
	}
}
class InDeveloper extends InEmployee{
	String[] hobbies;
	public InDeveloper(String name,int empId,String[] hobbies)
	{
		super(name,empId);
		this.hobbies=hobbies;
	}
	public void showHobbies() {
		System.out.println("Hobbies of Developer :");
		for(String hobby:hobbies)
		{
			System.out.println(hobby);
		}
	}
	public void calcBonus(int amount) {
		System.out.println("Bonus for Developer: "+amount*1.5);
	}
}
public class InherDemo {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter Manager or Developer");
		String choice=src.next();
		String[] hobbies={"cricket","coding","gaming","golf","biking"};
		 if(choice.equals("Manager")) {
		InEmployee manager=new InManager("rajat",12345,140000);
		InManager manager2=(InManager)manager;
		manager2.greetMessage();
		manager.calcBonus(15000);
		manager.getDetails();
		
		 }
		 else if(choice.equals("Developer")) {
		InEmployee developer=new InDeveloper("rohan",12645,hobbies);
		InDeveloper developer2=(InDeveloper)developer;
		
		developer.getDetails();
		developer.calcBonus(13000);
		developer2.showHobbies();
		 }
		 else {
			 System.out.println("Wrong choice");
		 }
		 src.close();
	}
}
