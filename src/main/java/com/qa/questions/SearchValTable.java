package com.qa.questions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchValTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\backup2\\\\Softwares\\\\latestChrome\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HimazAhamed/Videos/4K%20Video%20Downloader+/seleniumTopics/him.html");
		
		WebElement table = driver.findElement(By.id("dataTable"));
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> rows = tbody.findElements(By.tagName("tr"));
		for (WebElement row : rows) {

            // Get the third column (index starts from 0, so the third column is index 2)
            List<WebElement> columns = row.findElements(By.tagName("td"));

            // Ensure the row has at least 3 columns
            if (columns.size() > 2) {

                // Get the name from the third column (index 2)
                String name = columns.get(2).getText();
                System.out.println(name);

                // Check if the name matches "test"
                if (name.equalsIgnoreCase("Frank Black")) {

                    // Find the checkbox in the first column (index 0)
                    WebElement checkbox = columns.get(0).findElement(By.tagName("input"));

                    // Click the checkbox if it's not already selected
                    if (!checkbox.isSelected()) {
                        checkbox.click();
                        System.out.println("Checkbox for 'test' clicked.");
                    }
                    break; // Exit loop after clicking the checkbox
                }
            }
        }
	}

}
