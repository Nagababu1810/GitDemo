package com.it.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id="txtUsername") WebElement username;
	@FindBy(name="txtPassword") WebElement Password;
	@FindBy(xpath="//input[@id='btnLogin']") WebElement login;
	
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	

	public void userlogin()
	{
		
		username.sendKeys("Admin");
		Password.sendKeys("admin123");
		login.click();
	}
	
}
