package com.Heroku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class stackPage {
	WebDriver driver;
	Actions actStack;
	
	public stackPage(WebDriver ldriver) {
	 		this.driver=ldriver;
	 	}
	
	@FindBy(xpath="//a[@class='list-group-item']")WebElement Oprationinstack;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement tryherePycode;
	@FindBy(xpath="//pre[@class=' CodeMirror-line ']")WebElement codefromexcel;
	@FindBy(xpath="//button[@type='button']")WebElement runbutton;
	
	@FindBy(xpath="//*[@id=\"content\"]/li[2]/a")WebElement implementaionlink;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement cliktryhere;
	@FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")WebElement codelinefromexcel ;
	@FindBy(xpath="//button[@type='button']")WebElement ndrunbutton;
	
    @FindBy(xpath="//*[@id=\"content\"]/li[3]/a")WebElement applicationslink;
    @FindBy(xpath="//a[@href='/tryEditor']")WebElement clikontryhere;
	@FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")WebElement lastcodefromex;
	@FindBy(xpath="//button[@type='button']")WebElement rdrunbutton;

	
	public GraphPage StackPage(String option,String option2, String imp,String imp2, String Application, String Application2 ) throws InterruptedException {
		
		Oprationinstack.click();
		Thread.sleep(2000);
		tryherePycode.click();
		Thread.sleep(2000);
		
		actStack= new Actions(driver);
		
		actStack.sendKeys(option).perform();
		runbutton.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		implementaionlink.click();
		cliktryhere.click();
		actStack.sendKeys(imp).perform();
		//codelinefromexcel.sendKeys(imp);
		Thread.sleep(2000);
		ndrunbutton.click();
		driver.navigate().back();
		
		Thread.sleep(2000);
		applicationslink.click();
		clikontryhere.click();
		actStack.sendKeys(Application).perform();
		//lastcodefromex.sendKeys(Application);
		Thread.sleep(2000);
		rdrunbutton.click();
		Thread.sleep(2000); 
		driver.navigate().back();
		Thread.sleep(2000);
		
		return new GraphPage(driver);
		
	}

	
}