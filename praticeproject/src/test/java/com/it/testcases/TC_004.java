package com.it.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.it.baseclasss.BaseTest;
import com.it.pageobjectmodel.LoginPage;
import com.it.pageobjectmodel.PimPage;

public class TC_004  extends BaseTest{

	@BeforeMethod
	public void setupprocess() throws IOException
	{
	
		init();
		
		setup("chrome");
		
		navigateurl();
		
		driver.manage().window().maximize();
	}
	
	@Test(enabled =false)
	public void logintest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.userlogin();
	}
	@Test
	public void pimtest()
	{
		PimPage pp=new PimPage(driver);
		pp.pimlogin();
	}
	
	
	//@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
