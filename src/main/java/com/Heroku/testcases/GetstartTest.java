package com.Heroku.testcases;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.Heroku.pages.GraphPage;
import com.Heroku.pages.Homepage;
import com.Heroku.pages.LoginPage;
import com.Heroku.pages.baseclass;
import com.Heroku.pages.getStartPage;
import com.Heroku.pages.stackPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class GetstartTest extends baseclass{
    
        @Test(priority=1, description="Verify my test casses")
        @Description("Allure test descrption")
        @Epic("EP001")
        @Feature("Feture1")
        @Story("NumpyNijaPage")
        @Step("GetStart")
        @Severity(SeverityLevel.NORMAL)
        
		public void GetStart() throws InterruptedException {
        	 
		
		getStartPage gtspa = PageFactory.initElements(driver,getStartPage.class);
		gtspa.getstart();
		
		
		LoginPage lpag=PageFactory.initElements(driver,LoginPage.class);
		lpag.login(excel.getStringData("Sheet1", 1, 0), excel.getStringData("Sheet1", 1, 1));
		
		
		Homepage home = PageFactory.initElements(driver,Homepage.class);
        home.homepage();
         
        stackPage stpage= PageFactory.initElements(driver,stackPage.class);
        stpage.StackPage(excel.getStringData("Add", 0, 0), excel.getStringData("Add", 1, 0),
        		excel.getStringData("subtract", 0, 0),excel.getStringData("subtract", 1, 0),
        		excel.getStringData("divide", 0, 0),excel.getStringData("divide", 1, 0));  
        
        GraphPage grapage = PageFactory.initElements(driver, GraphPage.class);
        grapage.graphtograph(excel.getStringData("graph1", 0, 0), excel.getStringData("graphrepresent", 0, 0));
        
    }
        
      //  @Test(priority=2)
         public void GetStartInvalidSreenShot() throws IOException, InterruptedException {
        	
        	LoginPage getinvlidpass = PageFactory.initElements(driver,LoginPage.class);
        	getinvlidpass.Invalidpasswordscreenshot(excel.getStringData("Sheet2", 1, 0), excel.getStringData("Sheet2", 1, 1));
        	System.out.println(getinvlidpass);
        }
        
    }
