package com.qa.regression;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.lib.ExcelDataConfig;
import com.qa.pages.HimazPage;
import com.qa.testcases.HimazTestPage;

public class HimazTestPageRegTwo extends TestBase {
	public HimazTestPage himazTestPage;
	public HimazPage himazPage;
	
	public HimazTestPageRegTwo() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		himazTestPage = new HimazTestPage();
		himazPage = new HimazPage();
		
	}
	
	
	@Test(dataProvider = "userDetails")
	public void verifyLogin(String username, String pass) throws Exception
	{
		himazTestPage = new HimazTestPage();
		himazPage = new HimazPage();
		himazPage.login(username, pass);
		Thread.sleep(3000);
		String afterLoginTitle = himazPage.getTitleAfterLogin();
		Assert.assertEquals(afterLoginTitle, "DEMOQA", "TitleNotFound");
		
	}
	
	@DataProvider(name = "userDetails")
	public Object[][] passContactDetails() throws Exception
	{
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\HimazAhamed\\eclipse-workspace\\tryOut\\src\\main\\java\\com\\qa\\testdata\\testData.xlsx");
		int rows = config.getRowCount(0);
		Object[][] arrUserDetails = new Object[rows][2];
		for(int i=0; i<rows ; i++)
		{
			arrUserDetails[i][0] = config.getData(0, i, 0);
			arrUserDetails[i][1] = config.getData(0, i, 1);
		}
		return arrUserDetails;
	}
	
	
	@AfterMethod
	public void cleanUp()
	{
		driver.close();
	}

}
