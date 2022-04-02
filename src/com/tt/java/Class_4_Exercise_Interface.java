package com.tt.java;

public interface Class_4_Exercise_Interface {
	
	//Interface can have only abstract methods and static method 
	
	//Abstract Method :  an Abstract method is a method that is declared, but contains no implementation.
	
	public abstract void iDoor();
	
	public abstract int iWheels();
	
	public abstract String iColor();

	//Java 8 and onwards can have also static method
	
	public static void test(){
		String name = "Patwary";
	}
	
	//By default Abstract Method 
	public void icar();
}
