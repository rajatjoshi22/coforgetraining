package com.voterapp.service;

import com.voterapp.exception.*;

public interface ElectionBooth {
	boolean checkElegibility(int age, String locality, int vid)
			throws InValidVoterException;
}
