package com.voterapp.service;

import com.voterapp.exception.*;

public class ElectionBoothImpl implements ElectionBooth {
	String[] localities = new String[] { "Delhi", "Banglore", "Merrut", "Lucknow", "Noida" };
	boolean condition;

	@Override
	public boolean checkElegibility(int age, String locality, int vid)
			throws InValidVoterException {
		// TODO Auto-generated method stub
		try {
		   if(checkAge(age))
		   {
			   if(checkLocality(locality))
			   {
				   if(checkVoterId(vid)) {
					   return true;
				   }
			   }
		   }
		  
		}
			catch(Exception e) {
				throw e;
			}
		return false;
			
		
		
	}

	private boolean checkAge(int age) throws UnderAgeException{
		if (age < 18)
			throw new UnderAgeException("you are under age");
		else
			return true;
	}

	private boolean checkLocality(String locality) throws LocalityNotFoundException {
		for (String val : localities)
			if (val.equals(locality))
				return true;
		
				throw new LocalityNotFoundException("Locality not found");

	}

	private boolean checkVoterId(int vid) throws NoVoterIdException {
		if (vid >= 1000 && vid <= 9999)
			return true;
		else
			throw new NoVoterIdException("voterId not exist");
	}

}
