package com.coforge.thread;
class User implements Runnable{

	 String name;
	 double amount;
	 double interest;
	 Bank bank;
	public User(String name, double amount,Bank bank) {
		super();
		System.out.println("In Cons "+name);
		this.name = name;
		this.amount = amount;
		this.bank=bank;
		Thread th1=new Thread(this,name);
		th1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(bank) {
	System.out.println("In run");
	interest=bank.calculateInterest(name,amount);
	System.out.println(interest);
		}
	}
	
	

}
public class DemoRun1{
	public static void main(String[] args) {
		System.out.println("In main");
		Bank bank=new Bank();
		User user1=new User("Rajat",11000,bank);
		User user2=new User("Rohan",13000,bank);
		User user3=new User("Raj",14000,bank);
		
	}
}
