package com.tt.java;

public class Class_5_Exercise_Singleton {

	// Singleton is class that can have only one object
	
	// Private constructor, it prevents any other class from instantiating
	private Class_5_Exercise_Singleton(){
		
	}
	
	//Private static object of the class
	private static Class_5_Exercise_Singleton objSingleton = new Class_5_Exercise_Singleton();
	
	
	//Static instance method
	public static Class_5_Exercise_Singleton getSingletonInstance(){
		return objSingleton;
	}
	
	//Method protected by Singleton
	protected static void demo(){
		System.out.println("Demo method for singleton class");
	}
}
