package com.coforge.thread;

public class Bank {
       double calculateInterest(String name,double amount) {
    	   double interest=0.0;
    	   System.out.println("In bank");
    	   System.out.println("Interest for :"+name);
    	   interest=amount*(3)/1000;
    	   try{
    	   Thread.sleep(1000);
    	   }catch(InterruptedException e) {
    		   e.printStackTrace();
    	   }
    	   System.out.println("Interest: "+interest);
    	   return interest;
       }
}
