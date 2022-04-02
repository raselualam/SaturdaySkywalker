package com.tt.java;

public class Class_2_Exercise_IfElse {

	public static void main(String[] args) {
		
		int age = 66;
		
//		ifElseStatement(age);
		
		int day = 5;
	
		switchCase(day);
		
		}
		
		//If Else Statement
		public static void ifElseStatement(int age){
			if (age < 13){
				System.out.println("You are children");
			} else if (age >13 && age < 18){
				System.out.println("You are Teenager");
			} else if (age >60){
				//Nested If Else Statement
				if(age > 100){
					System.out.println( "You are Hero");
				}else if(age >65 && age < 100){
					System.out.println( "You are Retired");
				} else {
					System.out.println( "You are Senior");
				}
			} else {
				System.out.println("You are adult");
			}
		}

		//SwitchCase
		public static void switchCase(int day){
			switch (day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			}
		}
}
