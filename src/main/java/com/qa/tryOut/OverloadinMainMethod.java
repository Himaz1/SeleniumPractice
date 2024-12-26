package com.qa.tryOut;

public class OverloadinMainMethod {
	public static void main(String[] args) {
		main(87);
		main("Himaz");
		//main(args);
	}
	
	public static void main(String args) {
		System.out.println("String para");
	}
	
	public static void main(int args) {
		System.out.println("int para");
	}

}
