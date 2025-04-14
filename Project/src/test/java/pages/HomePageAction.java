package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocator;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageAction {

    private WebDriver driver;
    WebDriverHelper helper;

    public HomePageAction(WebDriver driver)
    {
        this.driver = driver;
        helper = new WebDriverHelper(this.driver);
    }

    public void clickOnsearchIcon(ExtentTest test)
    {
        helper.clickAction(HomePageLocator.searchIcon);
        test.log(Status.INFO, "clicked on search icon on homepage");
        LoggerHandler.info("clicked on search icon on homepage");
    }

    public void SearchForValue(ExtentTest test, String value)
    {
        helper.clickAction(HomePageLocator.searchBar);
        helper.sendKeys(HomePageLocator.searchBar, value);
        helper.clickAction(HomePageLocator.searchIcon2);

        test.log(Status.INFO, value + "searched successfully");
        LoggerHandler.info(value  + "searched successfully");

    }
    
}
