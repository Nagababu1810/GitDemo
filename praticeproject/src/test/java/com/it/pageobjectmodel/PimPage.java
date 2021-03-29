package com.it.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.it.baseclasss.BaseTest;

public class PimPage  extends BaseTest{

	@FindBy(xpath="menu_pim_viewPimModule") WebElement pimlink;
	@FindBy(id="empsearch_employee_name_empName") WebElement empname;
	@FindBy(id="empsearch_id") WebElement idvalue;
	@FindBy(xpath="//input[@id='empsearch_supervisor_name']") WebElement supname;
	@FindBy(id="empsearch_job_title") WebElement job_title;
	@FindBy(id="empsearch_job_title") WebElement empstatus;
	@FindBy(id="empsearch_sub_unit") WebElement subunit;
	@FindBy(id="empsearch_termination") WebElement include;
	
	public PimPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public void pimlogin()
	{
		pimlink.click();
		empname.sendKeys("nagababuu");
		idvalue.sendKeys("101");
		supname.sendKeys("raju");
		
		selectoption(job_title,"IT Manager");
		selectoption(empstatus,"Freelance");
		selectoption(subunit,"Engineering");
		selectoption(include,"Past Employees Only");
		
	}

	
}