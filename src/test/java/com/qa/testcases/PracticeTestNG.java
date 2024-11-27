package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestNG {
	
	@BeforeMethod
	public void set()
	{
		System.out.println("Hi");
	}
	
	@Test
	public void printName1()
	{
		System.out.println("Himaz1");
	}
	
	@Test (priority = 1)
	public void printName2()
	{
		System.out.println("Himaz2");
	}
	
	@Test(priority = 0)
	public void printName3()
	{
		System.out.println("Himaz3");
	}
	
	@AfterMethod
	public void end()
	{
		System.out.println("End");
	}

}
