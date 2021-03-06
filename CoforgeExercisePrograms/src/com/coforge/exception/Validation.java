package com.coforge.exception;

public class Validation {
	String[] names = new String[] { "rajat", "rohan", "virat", "rohit", "shreyas" };
	String password;

	boolean checkName(String name) throws NameExistsException {

		try {
			for (String nam : names)
				if (name.equals(nam)) {
					throw new NameExistsException("User already exists");

				}
		} catch (NameExistsException e) {
			System.out.println("Server Side name exception");
			throw e;
		}
		return true;

	}

	boolean checkPassword(String password) throws TooLongException, TooShortException {

		try {
			if (password.length() > 13) {
				throw new TooLongException("Password is too long |max limit 10");
			}
			if (password.length() < 5) {
				throw new TooShortException("Password is too Short| min limit 8");

			}
		} catch (TooShortException e) {
			System.out.println("Server side too short password");
			throw e;
		} catch (TooLongException e) {
			System.out.println("Server side too long password");
			throw e;
		}
		return true;

	}
}
