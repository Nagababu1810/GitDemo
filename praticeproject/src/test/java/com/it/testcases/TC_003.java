package com.it.testcases;

import java.io.IOException;

import com.it.baseclasss.BaseTest;
import com.it.pageobjectmodel.LoginPage;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws IOException {
		
		init();
		
		setup("chrome");
		
		navigateurl();
		
		driver.manage().window().maximize();
		
		
		LoginPage lp=new LoginPage(driver);
		lp.userlogin();

		
		

	}

}
