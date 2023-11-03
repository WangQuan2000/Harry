package com.harry.service;

public class If_Else {
	public static void main(String args[]) {
      int grade=9;
      if(grade==10) {
    	  System.out.println("Perfect");
      }else if(grade>=9&&grade<10) {
    	  System.out.println("Execellent");
      }else if(grade>=6&&grade<9) {
    	  System.out.println("Sufficient");
      }else {
    	  System.out.println("Insufficient");
      }
	}
}
