package com.Heroku.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Heroku.pages.LoginPage;
import com.Heroku.pages.baseclass;

public class LogTest extends baseclass{
	WebDriver driver;
	
//	@Test(priority=2)
	public void Loginpa() throws InterruptedException {
		
		LoginPage lpag=PageFactory.initElements(driver,LoginPage.class);
		lpag.login(excel.getStringData("Sheet1", 1, 0), excel.getStringData("Sheet1", 1, 1)); 
		
}
}
