package com.qa.tryOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TotalRowCountPagination {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\backup2\\Softwares\\latestChrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver (ChromeDriver in this case)
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL where your table is located
        driver.get("file:///C:/Users/HimazAhamed/Videos/4K%20Video%20Downloader+/seleniumTopics/him.html"); // Replace with the correct URL

        // Wait for the table to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dataTable")));

        // Initialize variables for total row count
        int totalRowCount = 0;
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
        totalRowCount = rows.size();

        // Navigate to the first page and start counting rows
        WebElement nextButton = driver.findElement(By.id("nextBtn"));
        
        do {
            // Count the rows on the current page
            List<WebElement> rows1 = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
            totalRowCount += rows1.size();
            
            // Print the row count for the current page (optional)
            System.out.println("Rows on the current page: " + rows.size());
            
            // Check if "Next" button is enabled (if it is, we can go to the next page)
            if (nextButton.isEnabled()) {
                nextButton.click();
                
                // Wait for the page to load after clicking "Next"
                wait.until(ExpectedConditions.stalenessOf(rows.get(0))); // Wait for the page to refresh
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dataTable"))); // Wait for the table to become visible again
            }
        } while (nextButton.isEnabled()); // Continue until the "Next" button is disabled (last page)

        // Print the total row count across all pages
        System.out.println("Total row count across all pages: " + totalRowCount);

        // Close the browser
        driver.close();
    }
}
