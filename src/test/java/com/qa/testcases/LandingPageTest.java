package com.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.lib.ExcelDataConfig;
import com.qa.pages.HimazPage;
import com.qa.pages.LandingPage;
import com.qa.util.TestUtil;

public class LandingPageTest extends TestBase{
public LandingPage landingPage;
	
	
	public LandingPageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		landingPage = new LandingPage();
		
	}
	
		
	@Test(priority=1)
	public void verifyUserRegistrationAndCreatePastBook() throws Exception
	{
		String title = landingPage.getLandingPageTitle();
		Assert.assertEquals(title, "DEMOQA", "Title Not Matched");
		
		Thread.sleep(2000);
		landingPage.clickLeftMenuIcon();
		Thread.sleep(2000);
		landingPage.clickSignInLink();
		Thread.sleep(3000);
		landingPage.handleWindowDuringRegistration();
		landingPage.clickLeftMenuIcon();
		Thread.sleep(3000);
		landingPage.clickSignOutLink();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=2)
	public void verifyUserLoginWithPreviousCredentials() throws Exception
	{
		String title = landingPage.getLandingPageTitle();
		Assert.assertEquals(title, "DEMOQA", "Title Not Matched");
		
		Thread.sleep(2000);
		landingPage.clickLeftMenuIcon();
		Thread.sleep(2000);
		landingPage.clickSignInLink();
		Thread.sleep(3000);
		landingPage.handleWindowDuringLogIn();
		
		String title1 = landingPage.getPageTitleFterLogIn();
		Assert.assertEquals(title1, "Browse “Himaz” · PastBook", "Title Not Matched");
	}
	
	@DataProvider(name = "userDetails")
	public Object[][] passContactDetails() throws Exception
	{
		ExcelDataConfig config = new ExcelDataConfig("C:/Users/USER/workspace/FreeCRMTest/src/main/java/com/fb"
				+ "/qa/testdata/FreeCRMTestData.xlsx");
		int rows = config.getRowCount(0);
		Object[][] arrUserDetails = new Object[rows][3];
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
