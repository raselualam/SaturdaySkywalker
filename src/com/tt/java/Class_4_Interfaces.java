package com.tt.java;

public interface Class_4_Interfaces {
	
	//Interface can have only abstract methods, java 8 and onwards can have static method
	
	public void iDoor();
	
	public abstract int iWheels();
	
	public abstract String iColor();
	
	//Java 8 and onwards: 
		
	public static void test(){
		
	}
	
	public void test2();
	
	/* 
	 
	  (Parent)           (Keyword)          (Child)
	  Class               extends            Class
	  Abstract Class      extends            Class
	  Interface           implements         Class
	  Interface           extends            Interface

	 */
}