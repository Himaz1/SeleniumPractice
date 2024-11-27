package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HimazPage extends TestBase{
	@FindBy (xpath="//button[@id='login']")
	WebElement btn_login;
	
	@FindBy (xpath="//input[@id='userName']")
	WebElement tf_username;
	
	@FindBy (xpath="//input[@id='password']")
	WebElement tf_password;
	
	@FindBy (xpath="//button[@id='login']")
	WebElement btn_loginTwo;
	
	
	
	public HimazPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleAfterLogin()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String username, String pass) throws InterruptedException
	{
		btn_login.click();
		tf_username.sendKeys(username);
		tf_password.sendKeys(pass);
		Thread.sleep(3000);
		btn_loginTwo.click();
		
		return new HomePage();
	}
	
	 

}
