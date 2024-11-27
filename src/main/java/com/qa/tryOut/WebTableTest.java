package com.qa.tryOut;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\backup2\\\\Softwares\\\\latestChrome\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/HimazAhamed/Videos/4K%20Video%20Downloader+/seleniumTopics/WebTableCheckbox.html");
		
		List<WebElement> list = driver.findElements(By.xpath("//tbody/tr"));
		System.out.println(list.size());
		
	}

}
