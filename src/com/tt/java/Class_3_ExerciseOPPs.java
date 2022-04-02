package com.tt.java;

public class Class_3_ExerciseOPPs {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
 	- 	Constructor cannot be static or override nor void or return type.
 	- 	Default Constructor
 	- 	Parameterized Constructor
 	-	Constructor overloading
 */
	
	String admin;
	int age2;
	
	//Constructor is a method same as class name, execute first, instance of class
	public Class_3_ExerciseOPPs(String name){
		admin = name;
	}
	
	public Class_3_ExerciseOPPs(String name, int age){
		admin = name;
		age2=age;
	}

	public static void main(String[] args) {
		
//		Class_3_ExerciseOPPs mondayGroup = new Class_3_ExerciseOPPs("Habib");
//		
//		System.out.println("mondayGroup Admin : " + mondayGroup.admin);
//		
//		Class_3_ExerciseOPPs tuesdayGroup = new Class_3_ExerciseOPPs("Mahmud");
//		
//		System.out.println("tuesdayGroup Admin : " + tuesdayGroup.admin);
		
		Class_3_ExerciseOPPs overloadObj = new Class_3_ExerciseOPPs("Mahmud", 27);
		
		System.out.println("overloadObj Admin : " + overloadObj.admin);
		
		System.out.println("overloadObj Age : " + overloadObj.age2);
		
		// myObj.mymethod(28);

	}
	
	public void mymethod(int age){
		System.out.println(age);
	}

}
