package com.qa.tryOut;

public class One {
	public static void main(String[] args) {
		System.out.println("method 1");
		
		main("hi");
		main(4);
		main();
	}
	
	public static void main(String args) {
		System.out.println("method 2");
	}
	
	public static void main(int a) {
		System.out.println("method 3");
	}
	
	public static void main() {
		System.out.println("method 4");
	}

}
