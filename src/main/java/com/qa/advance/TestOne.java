package com.qa.advance;

import java.util.ArrayList;
import java.util.Iterator;

public class TestOne {
	public static void main(String[] args) {
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add(45);
		obj.add("Himaz");
		obj.add(2.5);
		obj.add(100);
		obj.add("Test");
		obj.add(1, 10);
		obj.add(0, 20);
		
		Iterator<Object> it = obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("*******");
		for(Object output:obj)
		{
			System.out.println(output);
		}
		System.out.println("hhhhhh");
		//obj.forEach(System.out::println);
		
	}

}
