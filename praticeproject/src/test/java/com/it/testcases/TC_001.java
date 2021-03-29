package com.it.testcases;

import java.io.IOException;

import com.it.baseclasss.BaseTest;

public class TC_001 extends BaseTest{

	public static void main(String[] args) throws IOException {
		
		init();
		
		setup("chrome");
		
		navigateurl();
		
		driver.manage().window().maximize();
		
		String pg=driver.getPageSource();
		System.out.println(pg);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
	
	}

}
