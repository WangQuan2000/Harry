package com.harry.service;

public class CastingExample {
    public static void main(String args[]) {
    
    	String s1="harry";
    	String s2="123";
    	String s3="123harry";
    	
    	//System.out.println(Integer.parseInt(s1));   mannual casting
    	System.out.println(Integer.parseInt(s2));
    	//System.out.println(Integer.parseInt(s3));
    	
    	
    	
	  int myInt=9;
	  double myDouble;
	  myDouble=myInt;
	  System.out.println("When assigning an int to a double:"+ myDouble);
	  
	  //try to assign a double to an int
      int myInt2;
      double myDouble2=9.3;
      myInt2=(int)myDouble2;
      System.out.println("When assigning double to an int:"+ myInt2);
      System.out.println((int)Math.PI);
      System.out.println((double)Math.PI);
      System.out.println((float)Math.PI);
      
      double myDouble3=3.141592653589793;
      float myDouble4;
      myDouble4=(float)myDouble3;
      System.out.println(myDouble4);
      
      float myDouble5=3;
      double myDouble6;
      myDouble6=(double)myDouble5;
      System.out.println(myDouble6);
      
      
      
}
}
