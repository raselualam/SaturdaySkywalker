package com.tt.java;

public class Class_4_ExerciseAbstructionImp extends Class_4_ExerciseAbstruction{

	public static void main(String[] args) {
		Class_4_ExerciseAbstructionImp obj = new Class_4_ExerciseAbstructionImp();
		obj.iDoor();
	}
	
	
	public void iDoor(){
		int numDoor =2;
		System.out.println(numDoor);
	}
	
	public int iWheels(){
		int numWheel = 4;
		return numWheel;
	}
	
	public String iColor(){
		String color = "Blue";
		return color;
	}
}
