package pages;
import com.aventstack.extentreports.Status;
import stepdefinition.Hooks;
import uistore.HomePageFooterLocator4;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageFooterAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void methodAwards(){
        try{
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickAwards, 4);
            driverHelper.clickAction(HomePageFooterLocator4.clickAwards);
            LoggerHandler.info("clicked on Awards");
            Hooks.test.log(Status.INFO, "Clicked on Awards");
            String expectedUrl = ExcelReader.readCellValue("Varsha", "1", "value");
            Assertion.asserUrl(expectedUrl, Hooks.test);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void methodBlogs(){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickBlogs, 5);
            driverHelper.clickAction(HomePageFooterLocator4.clickBlogs);
            LoggerHandler.info("clicked on Blogs");
            Hooks.test.log(Status.INFO, "clicked on Blogs");
            String blogExpectedUrl = ExcelReader.readCellValue("Varsha", "2", "value");
            Assertion.asserUrl(blogExpectedUrl, Hooks.test);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void methodWarrantyPolicy(){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickWarrantyPolicy,4);
            driverHelper.clickAction(HomePageFooterLocator4.clickWarrantyPolicy);
            LoggerHandler.info("clicked on Warrenty Policy");
            Hooks.test.log(Status.INFO, "clicked on Warrenty Policy");
            String warentyExpectedUrl = ExcelReader.readCellValue("Varsha", "3", "value");
            Assertion.asserUrl(warentyExpectedUrl, Hooks.test);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void methodTermsandConditions(){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickTermsandConditions,4);
            driverHelper.clickAction(HomePageFooterLocator4.clickTermsandConditions);
            LoggerHandler.info("clicked on Terms and Conditions");
            Hooks.test.log(Status.INFO, "clicked on Terms and Conditions");
            String ConditionExpectedUrl = ExcelReader.readCellValue("Varsha", "4", "value");
            Assertion.asserUrl(ConditionExpectedUrl, Hooks.test);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void methodProduction(){
        try{
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickProduction, 4);
            driverHelper.clickAction(HomePageFooterLocator4.clickProduction);
            LoggerHandler.info("clicked on Production");
            Hooks.test.log(Status.INFO, "clicked on Production");
            String productionExpectedTitle = ExcelReader.readCellValue("Varsha", "6", "value");
            Assertion.asserTitle(productionExpectedTitle, Hooks.test);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void methodLiveAtAvon(){
        try{
            Base.driver.navigate().back();
            LoggerHandler.info("navigate to home page");
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickLifeAtAvon, 4);
            driverHelper.clickAction(HomePageFooterLocator4.clickLifeAtAvon);
            LoggerHandler.info("clicked on Life At Avon");
            Hooks.test.log(Status.INFO, "clicked on Live At Avon");  
            String AvonExpectedTitle = ExcelReader.readCellValue("Varsha", "8", "value");
            Assertion.asserTitle(AvonExpectedTitle, Hooks.test);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
