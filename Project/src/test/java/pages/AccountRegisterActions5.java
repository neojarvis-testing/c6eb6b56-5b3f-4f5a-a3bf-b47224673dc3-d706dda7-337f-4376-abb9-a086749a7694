package pages;



import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.AccountRegister5;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class AccountRegisterActions5 {

    public static void verifyAccountRegisterUrl(){
        try {
            WebDriverHelper wb = new WebDriverHelper(Base.driver);
            String actual = wb.getCurrenURL();
            String expected = ExcelReader.readCellValue("Raj", "16", "value");
            // Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            // TODO: handle exception
        }catch(AssertionError e){
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());

        }
      
    }

    public static void verifyFirstName(){
        try {  WebDriverHelper wb = new WebDriverHelper(Base.driver);
            String actual = wb.getDOMAttribute(AccountRegister5.firstName, "placeholder");
            String expected = ExcelReader.readCellValue("Raj", "2", "value");
            
            // Assert.assertEquals(actual, expected);
            
        } catch (Exception e) {
            // TODO: handle exception
        } catch(AssertionError e){
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());

        }
       
    }

    public static void inputLatName(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(AccountRegister5.lastName);
         LoggerHandler.info("clicked on Last Name");
        wb.sendKeys(AccountRegister5.lastName, ExcelReader.readCellValue("Raj", "3", "value")); //3 "Lastname"
        System.out.println(ExcelReader.readCellValue("Raj", "3", "value"));
        LoggerHandler.info("Entered Value in Last Name");
        Hooks.test.log(Status.INFO, "Entered Value in Last Name");

    }

    public static void inputEmail(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(AccountRegister5.email);
        LoggerHandler.info("Clicked on Email input");
        Hooks.test.log(Status.INFO, "Clicked on Email input");
        wb.sendKeys(AccountRegister5.email, ExcelReader.readCellValue("Raj", "4", "value")); //4 "Email"
        LoggerHandler.info("Sent values into email input");
        Hooks.test.log(Status.INFO, "Sent values into email input");

    }

    public static void inputPhone(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(AccountRegister5.phone);
        LoggerHandler.info("Clicked on input Phone");
        Hooks.test.log(Status.INFO, "Clicked on input Phone");
        wb.sendKeys(AccountRegister5.phone, ExcelReader.readCellValue("Raj", "5", "value")); //5 "9876543210"
        LoggerHandler.info("Sent values into phone number");
        Hooks.test.log(Status.INFO, "Sent values into phone number");
    }

    public static void inputPassword(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(AccountRegister5.password);
        LoggerHandler.info("Clicked on input password");
        Hooks.test.log(Status.INFO, "Clicked on input password");
        wb.sendKeys(AccountRegister5.password , ExcelReader.readCellValue("Raj", "6", "value")); //6 "password"
        LoggerHandler.info("Sent Values into password");
        Hooks.test.log(Status.INFO, "Sent Values into password");
        
    }

    public static void clickOnSignup(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(AccountRegister5.signup);
        LoggerHandler.info("Clicked on Signup button");
        Hooks.test.log(Status.INFO, "Clicked on Signup button");
        Screenshot.captureScreenShot("TestCase 5 screenshot");

    }

  
    
}