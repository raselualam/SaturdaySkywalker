package com.tt.java;

public class Class_3_Exercise_Inheritance extends Class_2_Exercise {

	public static void main(String[] args) {
		
		Class_3_Exercise_Inheritance myobj = new Class_3_Exercise_Inheritance();
		
		myobj.login("rasel", "12345");
		
		car();
		car("White");
		car("Red", 2);
	}
	
	/* The process of obtaining the data members and methods from one class to another class is known as inheritance.
 	-	Single Inheritance
 	-	Multiple Inheritance	(Java doesn't support Multiple Inheritance directly rather through Interfaces)
 	-	Multilevel Inheritance
 
 */
	
	/* Polymorphism is the ability of an object to take on many forms.
		- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
		- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
	
	// Method Overloading
	public static void car(){
		System.out.println("My car is Audi");
	}
	
	public static void car(String color){
		System.out.println("My car is Audi, its color is " + color);
	}
	
	public static void car(String color, int door){
		System.out.println("My car is Audi, its color is " + color + ", This has door " + door);
	}
	
	// Method Overridding
	public static void login(String username, String password){
		System.out.println("This is the Method Overridding in child class");
	}

}
