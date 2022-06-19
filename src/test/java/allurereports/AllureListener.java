package allurereports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Heroku.pages.baseclass;
import com.Heroku.utility.BrowserFact;

import io.qameta.allure.Attachment;

public class AllureListener implements ITestListener{
	//baseclass ba = new baseclass();
	
	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}
	@Attachment
	public byte[]saveFailureScreenShot(WebDriver driver){
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	 
	@Attachment(value = "{0}",type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}
	
//	@Override
	public void onStart(ITestContext iTestContext) {
		System.out.println("I am on onStrat Method "+ iTestContext.getName());
		iTestContext.setAttribute("WebDriver", BrowserFact.getdriver());
	}
	
	//@Override
	public void onFinish(ITestContext iTestContext) {
		System.out.println("I am on onFinish Method "+ iTestContext.getName());
		
	}
	
	//@Override
	public void onTestStart(ITestResult iTestResult) {
		System.out.println("I am on onTestStart Method "+ getTestMethodName(iTestResult)+ "start");
		
	}
	
	
	//@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("I am on onTestSuccess Method "+ getTestMethodName(iTestResult)+ "succeed");
		
	}
	
	//@Override
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("I am on onTestFailure Method "+ getTestMethodName(iTestResult)+ "failed");
		Object testClass = iTestResult.getInstance();
		WebDriver driver = BrowserFact.getdriver();
		//Allure ScreenShot and SaveTestLog
		if(driver instanceof WebDriver) {
			System.out.println("ScreenShot captured for test case: "+ getTestMethodName(iTestResult));
			saveFailureScreenShot(driver);
			}
		saveTextLog(getTestMethodName(iTestResult)+ "failed and screenShot Taken!");
		
	}
	 //@Override
	 public void onTestSkipped(ITestResult iTestResult) {
		 System.out.println("I am on onTestSkipped Method "+ getTestMethodName(iTestResult)+ "skipped"); 
	 }
	 
	// @Override
	 public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		 System.out.println("Test failed but it is in defined success ratio "+ getTestMethodName(iTestResult)+ "percentage");
	 }
	
	
	
}
