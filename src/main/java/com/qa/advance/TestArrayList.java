package com.qa.advance;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(87);
		obj.add("Himaz");
		obj.add("Car");
		obj.add("QA");
		System.out.println(obj);
		System.out.println(obj.get(2));
		for (int i=0; i<obj.size(); i++)
		{
			System.out.println(obj.get(i));
		}
	}

}
