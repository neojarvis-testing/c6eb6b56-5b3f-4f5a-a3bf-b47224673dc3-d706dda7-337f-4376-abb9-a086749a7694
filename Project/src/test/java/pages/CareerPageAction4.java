package pages;
import org.openqa.selenium.By;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.CareerPageLocator4;
import uistore.HomePageFooterLocator4;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class CareerPageAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void methodCareerPageOne(){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickCareer, 4);
            driverHelper.clickAction(HomePageFooterLocator4.clickCareer);
            LoggerHandler.info("clicked on Career");
            Hooks.test.log(Status.INFO, "clicked on Career");
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void methodCareerPageTwo(){
        try{
            driverHelper.clickAction(CareerPageLocator4.clickApplyNow);
            Thread.sleep(1000);
            driverHelper.clickAction(CareerPageLocator4.clickCloseform);
            String actual = Base.driver.findElement(By.xpath("(//div[contains(text(),'Upload Your Job Profile')])[9]")).getText();
            String expected = ExcelReader.readCellValue("Varsha", "7", "value");
            Assertion.asserElement(expected, actual, Hooks.test);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

