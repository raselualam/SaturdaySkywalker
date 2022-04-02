package com.tt.java;

public class Class_2_Exercise_Loops {
	
	/* Type of Loops
  	1. For Loop - Do again and again upto upper limit
  	2. While Loop - Do again and again upto condition get filled
  	3. Do While Loop - Do action first then match the condition
  	4. Infinite Loop - Loops which never ends
 */

	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
//		practiceInfiteLoop();
		practiceNestedForLoop();
	}
	
	//For loop
	public static void practiceForLoop(){					//Do again and again upto upper limit
		int i;												//Initialize Variable
		for (i=1; i<10; i++){								//Set lower limit, upper limit, increment/decrement	
			System.out.println(" For Loops Number = " + i); //Action
		}
	}
	
	//While Loop
	public static void practiceWhileLoop(){                		//Do again and again upto condition get filled
		int i = 5;												//Initialize variable, setting starting point
		while (i<10){											//Setting Condition
			System.out.println(" While Loops Number = " + i);	//Action
			i++;												//Increment or Decrement
		}
	}
	
	//Do While Loop
	public static void practiceDoWhileLoop(){					//Do action first then match the condition
		int i=1;												//Initialize variable, setting starting point
		do {											
			System.out.println(" Do While Loops Number = " + i); //Action
			i++;												 //Increment or decrement
		} while (i<10);											 // Validate condition
	}
	
	//Infinite Loop
	public static void practiceInfiteLoop(){					//Loops never end
		int i;													//Initial Variable
		for (i=1;  ;i--){										//Setting No upper limit
			System.out.println("Infinite Loops Number = " + i); //Action
		}
	}
	
	
	//Nested Loop
	public static void practiceNestedForLoop(){								 // Loop inside another loop
		int i;																 // Initialize Variable i
		int j;																 // Initialize Variable j
		for (i=1; i<5; i++){												 // First Loop for i
			for (j=1; j<5; j++){											 //Second Loop for J
			System.out.println("Nested For Loops Number = " + i + " : " +j); //Action statement for J
		}
		System.out.println("Increase value of i -> " + i);					 //Action statement for i
	}
	}
}
