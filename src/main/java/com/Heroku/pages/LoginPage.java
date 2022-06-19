package com.Heroku.pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
     WebDriver driver;
     
     
     public LoginPage(WebDriver ldriver) { 
 		this.driver=ldriver;
 		
 	}
     @FindBy(xpath="//a[contains(text(),'Sign in')]")WebElement siginbutton; 
 	
 	@FindBy(xpath= "//input[@type = 'text']") WebElement uname;
 	
 	@FindBy(name = "password") WebElement pword;
 	
 	@FindBy(xpath= "//input[@value = 'Login']") WebElement login;
 	
 	public Homepage login(String usename, String pw) throws InterruptedException {
 		System.out.println("beforetest");
 		siginbutton.click();
 		Thread.sleep(2000);
 		uname.sendKeys(usename);
 		pword.sendKeys(pw);
 		Thread.sleep(2000);
 		login.click();
 		
 		return new Homepage(driver);
 		
 		
 	}
 	
 	public void invalidpassword(WebDriver ldriver) { 
 		this.driver=ldriver;
 	
    
	//System.out.println(currentdate);
	
 	}
 	
 	@FindBy(xpath="//button[@class='btn']") WebElement getStartbutton;
 	 @FindBy(xpath="//a[contains(text(),'Sign in')]")WebElement loginbutton; 
  	
  	@FindBy(xpath= "//input[@type = 'text']") WebElement Username;
  	
  	@FindBy(name = "password") WebElement password;
  	
  	@FindBy(xpath= "//input[@value = 'Login']") WebElement loginto;
  	
  	
  	
  	public void Invalidpasswordscreenshot(String username, String psw) throws IOException, InterruptedException {
  		Date currentdate = new Date();
  		String screenshortfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
  		System.out.println(screenshortfilename);
  		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
  		
		getStartbutton.click();
  		
  		loginbutton.click();
  		Thread.sleep(2000);
  		Username.sendKeys(username);
  		password.sendKeys(psw);
  	  File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  	   FileUtils.copyFile(screenshotFile, new File("./Screenshot/"+screenshortfilename+ ".png"));
  	
  		loginto.click();
  		
	 
	 Thread.sleep(2000);
    
    	driver.quit(); 
}
}
