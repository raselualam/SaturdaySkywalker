package com.tt.java;

public class Class_1_Exercise {
	
	public static void main(String[] args) {
		
		//Create Object for non static method
		Class_1_Exercise myObj = new Class_1_Exercise();
		
		myObj.myVoidMethod();
		
		System.out.println(myObj.myReturnMethod());
		
		//No need to create Object for static method
		myStaticMethod();
		
		System.out.println(myReturnStaticMethod());
	}
	
	//Variables
	int age = 50;
	
	//DataTypes
	int a = 10;
	String name = "Rasel";
	boolean car = true;
	
	//Access Modifiers
	public int age2 = 35;
	private String car2 = "BMW";
	protected boolean isNice = true;
	int sum = 50;

	//Method Types
	//Void Method
	public void myVoidMethod(){
		System.out.println("This is a void Method");
	}
	
	//Static Method
	public static void myStaticMethod(){
		System.out.println("This is a staic Method");
	}
	
	//Return Type Method
	public String myReturnMethod(){
		String text = "This is a retun type method non static";
		return text;
	}
	
	//Static Method
	public static String myReturnStaticMethod(){
		String text = "This is a retun type method static";
		return text;
	}
	
}
