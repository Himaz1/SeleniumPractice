package com.qa.questions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class TableSearchPaginationDoWhile {
WebDriver driver;
    
    public TableSearchPaginationDoWhile() {
        // Set up WebDriver (assuming you're using Chrome here)
        System.setProperty("webdriver.chrome.driver", "D:\\\\backup2\\\\Softwares\\\\latestChrome\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe"); 
        driver = new ChromeDriver();
    }

    public void searchAndSelectCheckbox(String searchName) {
        driver.get("file:///C:/Users/HimazAhamed/Videos/4K%20Video%20Downloader+/seleniumTopics/him.html");  // Change to your table URL

        boolean found = false;
        WebDriverWait wait = new WebDriverWait(driver, 10); // Explicit wait
        
        // Start with the do-while loop
        do {
            // Get all rows in the table
        	WebElement table = driver.findElement(By.id("dataTable"));
    		WebElement tbody = table.findElement(By.tagName("tbody"));
    		List<WebElement> rows = tbody.findElements(By.tagName("tr"));
            //List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));

            for (WebElement row : rows) {
                // Get the 3rd column (name column) text
                WebElement nameCell = row.findElement(By.xpath("td[3]"));

                if (nameCell != null && nameCell.getText().equalsIgnoreCase(searchName)) {
                    // If the name is found, find the checkbox (1st column) and click it
                    WebElement checkbox = row.findElement(By.xpath("td[1]//input[@type='checkbox']"));
                    if (!checkbox.isSelected()) {
                        checkbox.click();
                    }
                    found = true;  // Exit the loop once checkbox is clicked
                    break;
                }
            }

            if (!found) {
                // Click the "Next" button to go to the next page if the name isn't found
                try {
                    WebElement nextButton = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
                    if (nextButton.isEnabled()) {
                        nextButton.click();
                        wait.until(ExpectedConditions.stalenessOf(rows.get(0)));  // Wait for page load
                    } else {
                        System.out.println("Next button is disabled. No more pages.");
                        break;
                    }
                } catch (NoSuchElementException e) {
                    System.out.println("Next button not found.");
                    break;
                }
            }

        } while (!found);  // Continue looping until the name is found
        
        if (!found) {
            System.out.println("Name " + searchName + " not found in any page.");
        }
    }

    public static void main(String[] args) {
        TableSearchPagination tableSearch = new TableSearchPagination();
        tableSearch.searchAndSelectCheckbox("Frank Black");
    }

}
