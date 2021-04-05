package com.coforge.inher;

public class Vardemo {
	public static void main(String[] args) {
		
	
Vardemo demo=new Vardemo();
demo.calcSum(90,80);
demo.calcSum(10,11,12);
demo.calcSum(12,45,67,87,8,9,89,90);
}
	public void calcSum(int...x)
	{
		int sum=0;
		for(int val:x)
			sum=sum+val;
		System.out.println(sum);
	}
}