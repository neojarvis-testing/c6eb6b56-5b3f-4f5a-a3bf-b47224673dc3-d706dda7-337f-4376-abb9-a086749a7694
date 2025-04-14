package utils;
 
import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
public class Assertion{
		
	public static void asserTitle(String expectedTitle, ExtentTest test)
	{
		try {
			String actualTitle = Base.driver.getTitle();
			Assert.assertTrue(actualTitle.contains(expectedTitle));
			
			LoggerHandler.info("Title " + expectedTitle + " verified");
			test.log(Status.PASS, "Title " + expectedTitle + " verified");
		}
		catch(AssertionError e)
		{
			LoggerHandler.error("Title " + expectedTitle + " not verified");
			test.log(Status.FAIL, "Title " + expectedTitle + " not verified");
 
		}
	}
	
	public static void asserUrl(String expectedUrl, ExtentTest test)
	{
		try {
			String actualUrl = Base.driver.getCurrentUrl();
			Assert.assertTrue(actualUrl.contains(expectedUrl));
			
			LoggerHandler.info("URL " + expectedUrl + " verified");
			test.log(Status.PASS, "URL " + expectedUrl + " verified");
		}
		catch(AssertionError e)
		{
			LoggerHandler.error("URL " + expectedUrl + " not verified");
			test.log(Status.FAIL, "URL " + expectedUrl + " not verified");
 
		}
	}
	
	public static void asserElement(String expectedValue, String actualValue, ExtentTest test)
	{
		try {
			Assert.assertTrue(actualValue.contains(expectedValue));
			
			LoggerHandler.info( expectedValue + " verified");
			test.log(Status.PASS, expectedValue + " verified");
		}
		catch(AssertionError e)
		{
			LoggerHandler.error(expectedValue + " not verified");
			test.log(Status.FAIL, expectedValue + " not verified");
 
		}
	}
}
 
