package com.coforge.threads;

public class Student implements Runnable {
	String name;
	String question;
	Trainer trainer;
	String answer;

	public Student(String name, String question, Trainer trainer) {
		super();
		System.out.println("In constructor "+name);
		this.name = name;
		this.question = question;
		this.trainer = trainer;
		Thread th1 = new Thread(this, name);
		th1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (trainer) {
			System.out.println("In run");
			answer = trainer.answerQuery(name, question);
			System.out.println(answer);
		}

	}

}
