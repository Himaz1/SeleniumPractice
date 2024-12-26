package com.qa.advance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchThenClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\backup2\\Softwares\\latestChrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://syscolabs.lk/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Our Tech')]"))).build().perform();
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='desktop___sub_menu__2TT7Q']/ul/descendant::li"));
		for(int i=0; i<li.size(); i++)
		{
			if(li.get(i).getText().equalsIgnoreCase("Quality Engineering"))
			{
				li.get(i).click();
				break;
			}
		}
	}

}
