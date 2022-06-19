package com.Heroku.pages;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



import com.Heroku.utility.BrowserFact;
import com.Heroku.utility.ConfigDataProvider;
import com.Heroku.utility.ExcelDataProvider;

 
public class baseclass { 
	
	public WebDriver driver; 
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	@BeforeSuite
	public void setUpSuite() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}
	
	@BeforeTest
    public void setup() {
		
		driver= BrowserFact.StartBrowser(driver, config.getBrowser(), config.geturl());
		System.out.println(driver.getTitle());
    }
	
	   @AfterTest
		public void tearDown() {
			System.out.println(driver.getTitle());
			BrowserFact.quitBrowser(driver);
		}
}
