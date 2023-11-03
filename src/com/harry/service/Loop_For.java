package com.harry.service;

public class Loop_For {
	public static void main(String args[]) {
     int start=1;
     int end=100;
     int total=0;
     
     for(int i=1;i<=100;i++) {
    	 total=total+i;
     }
     System.out.println(total);
     System.out.println(CalculateSum(12,8,30));
	}
	
	
	//method/function
	public static int CalculateSum(int p1, int p2, int p3) {
		return p1+p2;
	}
}
