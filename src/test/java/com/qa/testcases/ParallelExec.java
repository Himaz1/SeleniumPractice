package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pages.HimazPage;
import com.qa.util.TestUtil;

public class ParallelExec {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters ("browser")
	public void launch(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\backup2\\Softwares\\latestChrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\it17145930\\aaaWorkspace\\browserDrivers\\gechoDriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			//DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			//caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			//System.setProperty("webdriver.ie.driver", "C:\\Users\\it17145930\\aaaWorkspace\\browserDrivers\\IEDriver\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			//driver = new InternetExplorerDriver(caps);
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/books");
		//driver.get(prop.getProperty("url"));
		
//		himazTestPage = new HimazTestPage();
//		himazPage = new HimazPage();
	}
	
	@AfterMethod
	public void cleanUp()
	{
		driver.quit();
	}
	
	

}
