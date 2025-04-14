package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.aventstack.extentreports.Status;
import stepdefinition.Hooks;
import uistore.HomePageHeaderLocator4;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageHeaderAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void methodDealerLocatorPageOne(){
        try{
            Base.driver.navigate().back();
            driverHelper.clickAction(HomePageHeaderLocator4.clickDealerLocator);
            LoggerHandler.info("clicked on Dealer Locator");
            Hooks.test.log(Status.INFO, "clicked on Dealer Locator");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void methodDealerLocatorPageTwo(){
        try{
            Select select = new Select(Base.driver.findElement(By.name("stateFilter")));
            select.selectByValue("4");
            Thread.sleep(1000);
            Select selectone = new Select(Base.driver.findElement(By.name("cityFilter")));
            selectone.selectByValue("327");
            driverHelper.clickAction(HomePageHeaderLocator4.clickSearchIcon);
            Screenshot.captureScreenShot("citypage");
            Reporter.attachScreenshotToReport("CityPage", Hooks.test, "screenshot clicked");
            LoggerHandler.info("Screenshot Captured");
            Hooks.test.log(Status.INFO, "Screenshot Captured");
            String locatorExpectedUrl = ExcelReader.readCellValue("Varsha", "5", "value");
            Assertion.asserUrl(locatorExpectedUrl, Hooks.test);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

