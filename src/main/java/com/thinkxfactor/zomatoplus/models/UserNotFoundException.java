package com.thinkxfactor.zomatoplus.models;

public class UserNotFoundException extends Exception{
	String s1;
	public UserNotFoundException() {
		s1="User not found";
	}
	@Override
	public String toString()
	{
		return ("Error : "+s1);
	}

}
