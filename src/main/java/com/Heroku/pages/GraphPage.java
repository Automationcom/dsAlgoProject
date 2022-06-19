package com.Heroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GraphPage {
	
    WebDriver driver;
    Actions actGraph;
	public GraphPage(WebDriver ldriver) {
	 		this.driver=ldriver;
	 	}
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']") WebElement dataNavigation;
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[6]")WebElement GraphButton;
	@FindBy(xpath="//a[@href='graph']")WebElement ghaplink;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement Tryeditbutton;
	
	@FindBy(xpath="//pre[@role='presentation']")WebElement codeline1;
	@FindBy(xpath="//button[@type='button']")WebElement runbutton;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement trygraprepres;
	
	@FindBy(xpath="//*[@id=\"content\"]/li[2]")WebElement grphrepsrnlink;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement Tryedi2ndtbutton;
	@FindBy(xpath="//button[@type='button']")WebElement run2ndbutton;
	
	public void graphtograph(String graph, String graphRep) throws InterruptedException {
		dataNavigation.click();
		GraphButton.click();
		Thread.sleep(1000);
		ghaplink.click();
		Tryeditbutton.click();
		
		actGraph= new Actions(driver);
		actGraph.sendKeys(graph).perform();
		Thread.sleep(2000);
		runbutton.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//trygraprepres.click();
		grphrepsrnlink.click();
		Tryedi2ndtbutton.click();
		actGraph.sendKeys(graphRep).perform();
		Thread.sleep(2000);
		run2ndbutton.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
	}
	
	
	
	
	
	//a[@href='graph-representations']
	
	
}
