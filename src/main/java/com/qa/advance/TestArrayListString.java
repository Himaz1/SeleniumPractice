package com.qa.advance;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListString {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Himaz");
		obj.add("Car");
		obj.add("Cricket");
		for (String output:obj)
		{
			System.out.println(output);
		}
		System.out.println("***************");
		Iterator<String> it = obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
