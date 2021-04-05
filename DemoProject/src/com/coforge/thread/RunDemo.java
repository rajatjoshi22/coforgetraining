package com.coforge.thread;

//class Runthread implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
////		for (int i = 0; i < 10; i++) {
////			String tname = Thread.currentThread().getName();
////			System.out.println("HELLO " + i + " " + tname);
////			try {
////				Thread.sleep(2000);
////			} catch (InterruptedException e) {
////				e.printStackTrace();
////			}
////		}
//		Bank bank=new Bank();
//		double interest=bank.calculateInterest(2000);
//	    System.out.println(interest);	
//	}
//	
//}
public class RunDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
//		double interest = bank.calculateInterest(12000);
//		System.out.println(interest);
		Runnable rt = () -> {
            String name=Thread.currentThread().getName();
            System.out.println(name);
//			bank.calculateInterest(20000);
		};
		
		Thread th1 = new Thread(rt, "Thread-1");
		th1.start();
		Thread th2 = new Thread(rt, "Thread-2");
		th2.start();
	}
}
