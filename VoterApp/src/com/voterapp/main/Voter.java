package com.voterapp.main;

import com.voterapp.exception.*;
import com.voterapp.service.*;

import java.util.Scanner;

public class Voter {
	public static void main(String[] args) {
		int age;
		String locality;
		int voterid;
		boolean check;
		try (Scanner src = new Scanner(System.in);) {
			ElectionBooth voter = new ElectionBoothImpl();
			System.out.println("Enter your age");
			age = src.nextInt();
			System.out.println("Enter your locality");
			locality = src.next();
			System.out.println("Enter your voterid");
			voterid = src.nextInt();
			check = voter.checkElegibility(age, locality, voterid);
			if (check) {
				System.out.println("You are a genuine voter");
			} else {
				System.out.println("Fake voter");
			}
		} catch (InValidVoterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			System.out.println(e.getMessage());
		} 
	}
}
