package com.tt.java;

public class Class_4_Exercise_InterfaceImp implements Class_4_Exercise_Interface{
	
	
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

	@Override
	public void icar() {
		// TODO Auto-generated method stub
		
	} 
}

/* 
 
  (Parent)           (Keyword)          (Child)
  Class               extends            Class
  Abstract Class      extends            Class
  Interface           implements         Class
  Interface           extends            Interface

 */