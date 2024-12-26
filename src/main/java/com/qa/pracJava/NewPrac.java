package com.qa.pracJava;

public class NewPrac extends Prac{
	public void printName()
	{
		System.out.println("Khalid");
	}
	
	public static void main(String[] args) {
		NewPrac obj = new NewPrac();
		obj.printName();
		obj.printGame(87);
	}

}
