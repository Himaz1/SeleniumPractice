package com.qa.tryOut;

public class ReverseString {
	public static void main(String[] args)
	{
		//Question 01
		//Reverse a String?
		//Diff between String and StringBuffer? String immutable and StringBuffer mutable
		//Do we have a reverse function in String? No
		
		String s = "Selenium";
		int size = s.length();//8
		
		String reverse = " ";
		for(int i=size-1; i>=0; i--)
		{
			//reverse = reverse + s.charAt(i);
			System.out.println(s.charAt(i));
		}
		//System.out.println(reverse);
		
//		String s = "Selenium";
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.reverse());
	}

}
