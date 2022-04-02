package com.tt.java;

public class Class_5_Excercise_myException extends Exception{

String str1;
	
	public Class_5_Excercise_myException(String str2){
		str2=str1;
	}
	
	public String toStringAlpha(){
		return ("This is user defined exception by Alpha !!!" + str1);
	}
}
