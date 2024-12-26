package com.qa.pracJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchGoogle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\backup2\\Softwares\\latestChrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https:www.google.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement searchField = driver.findElement(By.xpath("//textarea[@title='Search']"));
		wait.until(ExpectedConditions.visibilityOf(searchField)).sendKeys("testing");
		List<WebElement> rows = driver.findElements(By.xpath("//ul[@role='listbox']/li/div"));
		for(int i=0; i<rows.size(); i++)
		{
			if(rows.get(i).getText().equalsIgnoreCase("testing tools"))
			{
				rows.get(i).click();
			}
		}
	}

}
