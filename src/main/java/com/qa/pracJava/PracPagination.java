package com.qa.pracJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracPagination {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\backup2\\Softwares\\latestChrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/HimazTechVideos/seleniumTopics/him.html");
		
		boolean found = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		int rows = 0;
		do {
			List<WebElement> row = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
			for(WebElement out:row)
			{
				WebElement nameCell = out.findElement(By.xpath("td[3]"));
				if(nameCell != null && nameCell.getText().equalsIgnoreCase("Eva White"))
				{
					WebElement checkbox = out.findElement(By.xpath("td[1]//input[@type='checkbox']"));
					if(!checkbox.isSelected())
					{
						checkbox.click();
					}
					found = true;
					break;
				}
			}
			if(!found)
			{
				try {
                    WebElement nextButton = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
                    if (nextButton.isEnabled()) {
                        nextButton.click();
                        wait.until(ExpectedConditions.stalenessOf(row.get(0)));  // Wait for page load
                    } else {
                        System.out.println("Next button is disabled. No more pages.");
                        break;
                    }
                } catch (NoSuchElementException e) {
                    System.out.println("Next button not found.");
                    break;
                }
				
			}
		} while (!found);
		
		if (!found) {
            System.out.println("Name Eva White not found in any page.");
        }
	}

}
