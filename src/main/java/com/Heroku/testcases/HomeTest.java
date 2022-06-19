package com.Heroku.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Heroku.pages.Homepage;
import com.Heroku.pages.LoginPage;
import com.Heroku.pages.baseclass;

public class HomeTest extends baseclass {
	Homepage homepage;
	//@Test(priority=3) 
	public void hometostacktest() throws InterruptedException {
		
        homepage.homepage();
		
	} 
	

}
