package com.tt.java;

import java.util.HashMap;
import java.util.HashSet;

public class Class_3_Exercise {

	public static void main(String[] args) {

		// Array store multipul data using index
		
		int age = 30;
		
		int[] ageSkywalker = new int []{25, 35, 30, 40, 32, 28};
		
		//Index                          0   1   2   3   4   5
		
		String[] nameSkywalker = new String []{"Soniah", "Lemon", "Habib"};
		
		//Index                                   0          1       2  
		
		System.out.println("Array Value : " + ageSkywalker[2]);
		System.out.println("ageSkywalker Array Length : " + ageSkywalker.length);
		System.out.println("Array Value : " + nameSkywalker[1]);
		System.out.println("nameSkywalker Array Length : " + nameSkywalker.length);

		//Multi-dimentional Array
		
		int[][] ageSkywalker2D = {
				{25, 35, 30, 40, 32, 28},	// [0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
				{35, 76, 24, 19}			// [1][0] [1][1] [1][2] [1][3]
		};
		
		System.out.println("Array Value : " + ageSkywalker2D[0][2]);
		
		//Multi-dimentional Print Array
		
		for (int i =0; i<ageSkywalker2D.length; i++){
			for (int j =0; j<ageSkywalker2D[i].length; j++){
				System.out.println("Multi-dimentional Array : " + ageSkywalker2D[i][j]);
			}
		}
		
		//Hashmap store data using key-value pair, Implementation of Map interface
		
		HashMap<String, String> Hometown = new HashMap<String, String>();
		Hometown.put("Soniah", "Sylhet");
		Hometown.put("Habib", "Dhaka");
		Hometown.put("Mahmud", "Barishal");
		Hometown.put("Patwary", "Noakhali");
		System.out.println("Hometown : "+Hometown.get("Patwary"));
		
		HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
		StudentAge.put("Soniah", 25);
		StudentAge.put("Habib", 38);
		StudentAge.put("Mahmud", 28);
		StudentAge.put("Patwary", 45);
		System.out.println("StudentAge : "+StudentAge.get("Habib"));
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		HashSet<String> Car = new HashSet<String>();
		Car.add("Toyota");
		Car.add("BMW");
		Car.add("Audi");
		System.out.println("Hashset Value : "+ Car);
	}

}
