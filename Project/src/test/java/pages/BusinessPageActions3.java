package pages;
 

 
import org.junit.Assert;
import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.BusinessPageLocators3;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class BusinessPageActions3 {
 
    WebDriverHelper helper = new WebDriverHelper(Base.driver);
 
    public void contactForm(ExtentTest test,String string) {
        try {
            test.log(Status.INFO,"Browser opened");
            LoggerHandler.info("browser opened");
            helper.scrollwindow(10500);
 
            helper.clickAction(BusinessPageLocators3.clickEmailField);
            test.log(Status.INFO, "clicked email field");
            LoggerHandler.info("clicked email field");
 
            helper.sendKeys(BusinessPageLocators3.clickEmailField, string);
            test.log(Status.INFO, "entered value in email field");
            LoggerHandler.info("entered value in email field");

            
            String emailactual = helper.getText(BusinessPageLocators3.verifyEmailField);
            String emailexpected = ExcelReader.readCellValue("Avinash", "6", "value");
            Assertion.asserElement(emailexpected, emailactual, Hooks.test);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
    public void inputPhno(ExtentTest test,String string2){
        try {
            helper.clickAction(BusinessPageLocators3.inputPhNoField);
            test.log(Status.INFO, "clicked phone field");
            LoggerHandler.info("clicked phone field");
 
            helper.sendKeys(BusinessPageLocators3.inputPhNoField, string2);
            test.log(Status.INFO, "entered value in phone field");
            LoggerHandler.info("entered value in phone field");

            String phnoActual = helper.getText(BusinessPageLocators3.verifyPhNo);
            String phnoExpected = ExcelReader.readCellValue("Avinash", "7", "value");
            Assertion.asserElement(phnoExpected, phnoActual, Hooks.test);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
    public void inputCountry(ExtentTest test, String string3){
        try {
            helper.clickAction(BusinessPageLocators3.inputCountryField);
            test.log(Status.INFO, "clicked country field");
            LoggerHandler.info("clicked country field");
 
            helper.sendKeys(BusinessPageLocators3.inputCountryField,string3);
            test.log(Status.INFO, "entered value in country field");
            LoggerHandler.info("entered value in country field");

            String countryLabel = helper.getText(BusinessPageLocators3.verifyCountryLabel);
            String countryExpected = ExcelReader.readCellValue("Avinash", "8", "value");
            Assertion.asserElement(countryExpected, countryLabel, Hooks.test);
           
        } catch (Exception e) {
            e.printStackTrace();
           
        }
 
 
    }
    public void inputCompany(ExtentTest test, String string4){
        try {
            helper.clickAction(BusinessPageLocators3.inputCompanyName);
            test.log(Status.INFO, "clicked on company field");
            LoggerHandler.info("clicked on company field");
           
            helper.sendKeys(BusinessPageLocators3.inputCompanyName,string4);
            test.log(Status.INFO, "entered value in company field");
            LoggerHandler.info("entered value in company field");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
    public void inputAddressField(ExtentTest test, String string5){
        try {
            helper.scrollwindow(500);
   
            helper.clickAction(BusinessPageLocators3.inputAddress);
            test.log(Status.INFO, "clicked on address field");
            LoggerHandler.info("clicked on address field");
 
            helper.sendKeys(BusinessPageLocators3.inputAddress, string5);
            test.log(Status.INFO, "entered value in address field");
            LoggerHandler.info("entered value in address field");
 
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
 
    }
    public void inputSubjectField(ExtentTest test, String string6){
        try {
            helper.clickAction(BusinessPageLocators3.inputSubject);
            test.log(Status.INFO, "clicked on subject field");
            LoggerHandler.info("clicked on subject field");
 
            helper.sendKeys(BusinessPageLocators3.inputSubject, string6);
            test.log(Status.INFO, "entered value in subject field");
            LoggerHandler.info("entered value in subject field");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
    public void inputMsg(ExtentTest test, String string7){
        try {
            helper.clickAction(BusinessPageLocators3.inputYourMsg);
            test.log(Status.INFO, "clicked on message field");
            LoggerHandler.info("clicked on message field");
 
            helper.sendKeys(BusinessPageLocators3.inputYourMsg, string7);
   
            helper.clickAction(BusinessPageLocators3.clickSendButton);
            test.log(Status.INFO,"clicked on send button");
            LoggerHandler.info("clicked on send button");
 
            Screenshot.captureScreenShot("Contact Forms");
            Reporter.attachScreenshotToReport("Contact Message Forms",test,"SS attached to report");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
 
}