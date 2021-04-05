package com.coforge.thread;

public class ChildThread extends Thread {
	public ChildThread(String name,int priority) {
		this.setName(name);
		setPriority(priority);
		System.out.println(this);
		start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			String tname = Thread.currentThread().getName();
			System.out.println("HELLO " + i + " " + tname);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
