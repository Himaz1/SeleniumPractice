package com.qa.questions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\backup2\\\\Softwares\\\\latestChrome\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HimazAhamed/Videos/4K%20Video%20Downloader+/seleniumTopics/him.html");
		
		WebElement table = driver.findElement(By.id("dataTable"));
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> list = tbody.findElements(By.tagName("tr"));
		System.out.println("Row count is: " + list.size());
		int rowCount = 0;
		//rowCount = list.size();
		WebElement nextBtn = driver.findElement(By.id("nextBtn"));
		
		do {
			//nextBtn.click();
			WebElement table1 = driver.findElement(By.id("dataTable"));
			WebElement tbody1 = table1.findElement(By.tagName("tbody"));
			List<WebElement> list1 = tbody1.findElements(By.tagName("tr"));
			//System.out.println("Row count is: " + list.size());
			rowCount += list1.size();
			nextBtn.click();
			
		} while (nextBtn.isEnabled());
		System.out.println("Total row count across all pages: " + rowCount);
		
		//driver.close();
	}

}
