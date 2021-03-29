package com.it.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static  WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumResources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.westernunion.com/in/en/web/user/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		
		
	}
	
	
	

