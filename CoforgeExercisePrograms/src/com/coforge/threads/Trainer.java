package com.coforge.threads;

public class Trainer {
	public String answerQuery(String name, String question) {
		String answer;
		System.out.println("In trainer");
		System.out.println("Answer for: " + name);
		answer = "This is your answer " + name;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return answer;

	}

}
