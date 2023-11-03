package com.harry.model;

public class Fruit {
   //attributes
   private String name;
   private int price;
   private String color;
   private boolean isSweet;
   
   //functions
   public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isSweet() {
		return isSweet;
	}
	public void setSweet(boolean isSweet) {
		this.isSweet = isSweet;
	}

}
