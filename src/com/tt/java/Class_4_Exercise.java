package com.tt.java;

public class Class_4_Exercise {
	
	//Encapsulation used to hide the data using setter and getter method

	private int ssn = 111111;			    	//Read & Write - See & Update
	private int password = 12345;               //Write only - Update 
	private String username = "testUsername";	//Read only - See
	
	
	//Setter method - set the data
	
	public void setSSN(int value){
		ssn=value;
	}
	
	public void setPassword(int value){
		password = value;
	}
	
	//Getter method - get the data
	
	public int getSSN(){
		return ssn;
	}
	
	public String getUsername(){
		return username;
	}
	
}
	
