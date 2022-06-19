package com.Heroku.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Heroku.pages.baseclass;
import com.Heroku.pages.stackPage;

public class StackTest extends baseclass{
	
	
	
	//@Test(priority=4)
	public void stacktoarry() throws InterruptedException {
		
		stackPage stpage= PageFactory.initElements(driver,stackPage.class);
        stpage.StackPage(excel.getStringData("Add", 0, 0), excel.getStringData("Add", 1, 0),
        		excel.getStringData("subtract", 0, 0),excel.getStringData("subtract", 1, 0),
        		excel.getStringData("divide", 0, 0),excel.getStringData("divide", 1, 0)); 
		
		
		
	}

}
