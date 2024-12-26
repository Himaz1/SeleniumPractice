package com.qa.questions;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
	public static void main(String[] args) {
//		String name = "Apple, Orange, Grapes, Banana";
//				
//		String[] fruits = name.split(", ");
//		
//		for(String out:fruits)
//		{
//			System.out.println(out);
//		}
		
		String arr = "soft";
		StringBuffer bf = new StringBuffer(arr);
		System.out.println(bf.reverse());
		String ax = "left";
		System.out.println(arr.equals(ax));
	}

}
