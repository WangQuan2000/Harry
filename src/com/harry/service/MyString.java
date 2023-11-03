package com.harry.service;

public class MyString {
public static void main(String args[]) {
	String name="Hubert";
	//1. check the length by the function of length()
	System.out.println(name.length());
	String name2="Harry ";
	
	if(name.length()>name2.length()) {
		System.out.println("Hubert is longer");
	}else if(name.length()<name2.length()){
		System.out.println("Harry is longer");
	}
	else {
		System.out.println("Harry is equal to Hubert");
	}
	
	//2. convert case
	String name3="HARRY Wang";
	String name4="quan";
	System.out.println(name3.toLowerCase());
	System.out.println(name4.toUpperCase());
	
	//3.find a character location
	String name5="Harry Potter";
	System.out.println(name5.indexOf("o"));
	System.out.println(name5.indexOf("r"));
	System.out.println(name5.indexOf("q"));
	
	//4. try to replace Wang with Jia
	

}
}
