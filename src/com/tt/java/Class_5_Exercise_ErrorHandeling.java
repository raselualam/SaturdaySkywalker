package com.tt.java;

public class Class_5_Exercise_ErrorHandeling {
	
	/*
	 
	 Java Exception - Use "try - catch - finally"
	 
	 	A. Built-in Exception : Built-in exception throws by java which explain certain error situations
			 1. ArithmeticException - error has occurred in an arithmetic operation.
			 2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index.
			 3. ClassNotFoundException - try to access a class whose definition is not found
			 4. FileNotFoundException - a file is not accessible or does not open.
			 5. IOException - input-output operation failed or interrupted
			 6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
			 7. NoSuchFieldException - class does not contain the field or variable specified
			 8. NoSuchMethodException - accessing a method which is not found
			 9. NullPointerException - referring to the members of a null object
			 10. NumberFormatException  -  a method could not convert a string into a numeric format
			 11. RuntimeException - any exception which occurs during runtime.
			 12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string
	 	
	 	B. User-defined Exception : User can also create exception where the error situations is not covered by java
	 
	 */
	
	public static void main(String[] args) {
	
		//Built-in Exception - ArrayIndexOutOfBoundsException
		
		try {
			
			int[] ageGroup = new int[] { 25, 22, 29, 35, 40};
			System.out.println("Student Age : "+ ageGroup[8]);
			
		} catch (Exception e){
			System.out.println("Please check the array index !!!");
			e.printStackTrace();
		}
		
		//Built-in Exception - ArrayIndexOutOfBoundsException
		
		try {
			
			int num = Integer.parseInt("Rasel");
			System.out.println("Value of num int : "+ num);
			
		} catch (NumberFormatException e){
			System.out.println("Please make sure input is a number !!!");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Completed Java error handeling using try catch, Test complete !!!");
		}
		
		// User Defined Exception
		
		try {
			throw new Class_5_Excercise_myException(" Test User Defined Exception, Alpha !!!");
		} catch (Class_5_Excercise_myException e){
			System.out.println("This is catch block");
			e.printStackTrace();
		}
	
	}

}





