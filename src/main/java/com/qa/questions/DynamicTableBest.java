package com.qa.questions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTableBest {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\backup2\\Softwares\\latestChrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("file:///C:/Users/HimazAhamed/Videos/4K%20Video%20Downloader+/seleniumTopics/him.html");
        
        WebDriverWait wait = new WebDriverWait(driver, 10); // Explicit wait
        
        WebElement nextBtn = driver.findElement(By.id("nextBtn"));
        int rowCount = 0;
        
        // First, count the rows on the initial page
        WebElement table = driver.findElement(By.id("dataTable"));
        WebElement tbody = table.findElement(By.tagName("tbody"));
        List<WebElement> rows = tbody.findElements(By.tagName("tr"));
        rowCount += rows.size(); // Add initial page row count
        
        // Now, start the pagination loop
        do {
            // Wait for the table to be populated with rows
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dataTable")));
            
         // Re-fetch table rows after "Next" is clicked
            table = driver.findElement(By.id("dataTable"));
            tbody = table.findElement(By.tagName("tbody"));
            rows = tbody.findElements(By.tagName("tr"));
            
            rowCount += rows.size(); // Increment rowCount by the number of rows in the current page
            
            // Check if the "Next" button is still enabled before clicking
            if (nextBtn.isEnabled()) {
                nextBtn.click(); // Click "Next" to go to the next page
                wait.until(ExpectedConditions.stalenessOf(rows.get(0))); // Wait for page transition
            } else {
                break; // Exit the loop if "Next" is not enabled (i.e., no more pages)
            }
        } while (nextBtn.isEnabled()); // Continue looping as long as the "Next" button is enabled

        System.out.println("Total row count across all pages: " + rowCount);

        driver.quit(); // Close the browser after execution
    }

}
