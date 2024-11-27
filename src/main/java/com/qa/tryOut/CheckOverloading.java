package com.qa.tryOut;

public class CheckOverloading {
	
	public void printName()
	{
		System.out.println("Himaz");
	}
	
	public void printName(int a)
	{
		System.out.println("Ahamed");
	}
	
	public static void main(String[] args) {
		CheckOverloading obj = new CheckOverloading();
		obj.printName();
		obj.printName(5);
	}

}
