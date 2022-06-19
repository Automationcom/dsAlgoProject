package com.Heroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	WebDriver driver; 
    
    
    public Homepage(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
    
    @FindBy(xpath="//a[@class='nav-link dropdown-toggle']")WebElement navidata;
    @FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[3]")WebElement slackbutton;
    
    
    public stackPage homepage() throws InterruptedException {
    	navidata.click();
    	Thread.sleep(2000);
    	slackbutton.click();
    	Thread.sleep(2000);
    	
    	return new stackPage(driver);
    }


	

}
