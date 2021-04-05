package com.coforge.langdemos;

public class StudentDetailsImpl implements StudentDetails {

	@Override
	public double getAverage(int... marks) {
		// TODO Auto-generated method stub
					int total=0;
					for(int num:marks) {
					total=total+num;
				}
				return (total)/marks.length;	
			
		}
	}


