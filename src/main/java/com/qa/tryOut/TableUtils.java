package com.qa.tryOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class TableUtils {

    public static int getTableRowCount(WebDriver driver, String tableId) {
        WebElement table = driver.findElement(By.id(tableId));
        WebElement tbody = table.findElement(By.tagName("tbody"));
        List<WebElement> rows = tbody.findElements(By.tagName("tr"));
        return rows.size();
    }

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "D:\\backup2\\Softwares\\latestChrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/HimazAhamed/Videos/4K%20Video%20Downloader+/seleniumTopics/dynamic-table.html");

        // Wait for the table to be loaded or updated dynamically
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicTable")));

        // Get the row count after waiting for the table to load
        int rowCount = getTableRowCount(driver, "dynamicTable");
        System.out.println(getTableRowCount(driver, "dynamicTable"));

        System.out.println("Number of rows in the table: " + rowCount);
        //driver.close();
    }
}

