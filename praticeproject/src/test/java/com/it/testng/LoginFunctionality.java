package com.it.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFunctionality {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumResources\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.westernunion.com/in/en/web/user/register");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	public void login() {
		
		driver.findElement(By.name("txtFName")).sendKeys("naga");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("babu");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("maddi");
		driver.findElement(By.cssSelector("#dob")).sendKeys("18/10/1991");
		
		driver.findElement(By.cssSelector("#address1")).sendKeys("kakinada");
		driver.findElement(By.name("mobileNumber")).sendKeys("9059506469");
		
		driver.findElement(By.id("option3")).click();
		
		Select sl=new Select(driver.findElement(By.id("dropdown-nationality")));
		sl.selectByVisibleText("American Samoa");
		
		Select sl1=new Select(driver.findElement(By.id("question")));
		sl1.selectByVisibleText("What is your place of birth?");
		
		driver.findElement(By.name("answer")).sendKeys("kakinada");
	
	
	}
	
	
	
}
