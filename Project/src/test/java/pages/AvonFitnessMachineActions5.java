
package pages;



import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;

// import org.testng.Assert;

import uistore.AvonFitnessMachineLocators5;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class AvonFitnessMachineActions5 {

    public static void verifyAFMurl(){
        try {  WebDriverHelper wb = new WebDriverHelper(Base.driver);
            String actual = wb.getCurrenURL();
            String expected = "https://avonfitnessmachines.com/";
            // Assert.assertEquals(actual, expected);
            
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        } catch(AssertionError e){
            LoggerHandler.error(e.getMessage());
            Hooks.test.log(Status.FAIL, e.getMessage());

        }
        

    }

    public static void closePopUP(){
        try {   
            WebDriverHelper wb = new WebDriverHelper(Base.driver);
            wb.waitForElementToBeClickable(AvonFitnessMachineLocators5.closePopUp, 8);
            wb.clickAction(AvonFitnessMachineLocators5.closePopUp);
            LoggerHandler.info("Closed the popup");
            Hooks.test.log(Status.INFO, "Closed the popup");
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
    public static void domesticGymHover(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.waitForElementToBeVisible(AvonFitnessMachineLocators5.domesticGym, 5);
        wb.hoverAction(AvonFitnessMachineLocators5.domesticGym);
        LoggerHandler.info("Hovered on Domestic Gym");
        Hooks.test.log(Status.INFO, "Hovered on Domestic Gym");
    }

    public static void cardioLineHover(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.waitForElementToBeVisible(AvonFitnessMachineLocators5.cardioLine, 5);
        wb.hoverAction(AvonFitnessMachineLocators5.cardioLine);
        LoggerHandler.info("Hovered on Cardio Line");
        Hooks.test.log(Status.INFO, "Hovered on Cardio Line");
       
    }

    public static void clickTreadmills(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.waitForElementToBeVisible(AvonFitnessMachineLocators5.treadmills, 5);
        wb.clickAction(AvonFitnessMachineLocators5.treadmills);
        LoggerHandler.info("Clicked on Treadmills");
        Hooks.test.log(Status.INFO, "Clicked on Treadmills");


    }


    
}
