package com.tt.java;

public abstract class Class_4_ExerciseAbstruction {
	
	//Abstract Class can have both abstract method and regular methods.

	//Regular or Non Abstract Method
	public int age(){
		return 30;
	}
	
	public void name(){
		String name = "Patwary";
	}
	
	//Abstract Method :  an Abstract method is a method that is declared, but contains no implementation.
	
	public abstract void iDoor();
	
	public abstract int iWheels();
	
	public abstract String iColor();

}
