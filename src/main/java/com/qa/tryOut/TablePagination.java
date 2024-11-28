package com.qa.tryOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablePagination {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\\\backup2\\\\Softwares\\\\latestChrome\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

        // Initialize WebDriver (ChromeDriver in this case)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Navigate to the URL where your table is located
        driver.get("file:///C:/Users/HimazAhamed/Videos/4K%20Video%20Downloader+/seleniumTopics/him.html"); // Replace with the correct URL

        // Wait for the table to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dataTable")));

        // Navigate to the last page
        WebElement nextButton = driver.findElement(By.id("nextBtn"));
        while (nextButton.isEnabled()) {
            nextButton.click();
            //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("pageNum"), "Page 3")); // Wait until the last page is reached
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='pageNum' and contains(text(),'Page 3')]")));
        }
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("pageNum"), "Page 3")); // Wait until the last page is reached
        // Count total rows in the table (across all pages)
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
        System.out.println("Total rows in the table: " + allRows.size());

        // Close the browser
        driver.close();
    }
}
