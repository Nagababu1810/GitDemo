package com.it.baseclasss;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseTest {

	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	public static Properties p;
	public static FileInputStream fi;
	
	public static void init() throws IOException {
		
	fi=new FileInputStream(projectpath+"\\data.properties");
	p=new Properties();
	p.load(fi);
		
	}
	
	public static void setup(String browser) {

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumResources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver","D:\\SeleniumResources\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.firefox.driver","D:\\SeleniumResources\\InternetExplorerdriverserver.exe");
			driver=new InternetExplorerDriver();
		}	
		if(browser.equalsIgnoreCase("edge")) {	
			System.setProperty("webdriver.firefox.driver","D:\\SeleniumResources\\edgedriver.exe");
			driver=new EdgeDriver();
		}	
	}

	public static void navigateurl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//driver.navigate().to(p.getProperty(url));

	}

	public void selectoption(WebElement locator, String String)
	{
		
		Select s=new Select(locator);
		s.selectByVisibleText(String);
		
	}

	
}		
