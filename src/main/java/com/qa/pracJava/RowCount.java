package com.qa.pracJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowCount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\backup2\\Softwares\\latestChrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/HimazTechVideos/seleniumTopics/him.html");
		
		//int rows = 0;
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
		System.out.println(row.size());
		int rows = row.size();
		WebElement nxtButton = driver.findElement(By.xpath("//button[@id='nextBtn']"));
		
		do {
			
			if(nxtButton.isEnabled())
			{
				nxtButton.click();
				List<WebElement> rowNew = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
				System.out.println(rowNew.size());
				rows += rowNew.size();
				//System.out.println("Total row count is:" + rows);
			}
			
		} while (nxtButton.isEnabled());
		
		System.out.println("Total row count is:" + rows);
	}

}
