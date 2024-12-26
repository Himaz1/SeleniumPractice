package com.qa.advance;

public class TestString {
	public static void main(String[] args) {
		String name = "Hello Himaz! How are you?";
		for(int i=(name.length())-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		
		System.out.println();
		StringBuffer bf = new StringBuffer(name);
		System.out.println(bf.reverse());
		
		String fruits = "apple,orange,grapes,banana,mango";
		String[] arr = fruits.split(",");
		for(String out:arr)
		{
			System.out.println(out);
		}
		
		String b = "   Hi Khalid! How are you thangam?  ";
		System.out.println(b.trim());
		
		String c = "Hi Shaza ";
		String d = ", Hana and Haya! How are you?";
		System.out.println(c.equalsIgnoreCase(d));
		System.out.println(c.concat(d));
	}

}
