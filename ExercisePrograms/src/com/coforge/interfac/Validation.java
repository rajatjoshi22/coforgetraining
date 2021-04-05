package com.coforge.interfac;

public class Validation {
	String[] names = new String[] { "rajat", "rohan", "prashant", "rahul", "virat" };
	boolean result;

	public boolean checkUsername(String name) throws Exception {
		try {
			for (String nam : names) {
				if (name.equals(nam)) {
					throw new Exception("User Already exist | please use a new name");

				}
			}

		} catch (Exception e) {
			System.out.println("Exception in server side");
			throw e;
		}
		return true;
	}
}
