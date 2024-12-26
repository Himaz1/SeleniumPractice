package com.qa.pracJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TestingNow {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Himaz");
		name.add("Khalid");
		System.out.println(name.size());
		
		
		Vector<String> ve = new Vector<String>();
		ve.add("Shaza");
		ve.add("Hana");
		ve.add("Nifla");
		System.out.println(ve.size());
		System.out.println(ve.capacity());
		
		LinkedList<String> li = new LinkedList<String>();
		li.add("ab");
		li.add("hh");
		li.add("dd");
		li.add("cc");
		System.out.println(li.size());
		System.out.println(li);
	}

}
