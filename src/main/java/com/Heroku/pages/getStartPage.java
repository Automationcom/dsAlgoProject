package com.Heroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class getStartPage { 
	WebDriver driver;
	
	public getStartPage(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath="//button[@class='btn']") WebElement gst;
	
	
	public LoginPage getstart() throws InterruptedException {
		gst.click();
		Thread.sleep(2000); 
		return new LoginPage(driver);
	} 

}
