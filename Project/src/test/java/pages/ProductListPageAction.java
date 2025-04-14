package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ProductListPageLocator;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class ProductListPageAction {

    private WebDriver driver;
    WebDriverHelper helper;

    public ProductListPageAction(WebDriver driver)
    {
        this.driver = driver;
        helper = new WebDriverHelper(this.driver);
    }
    
    public void clickOnProduct(ExtentTest test)
    {
        helper.clickAction(ProductListPageLocator.firstProduct);

        test.log(Status.INFO, "clicked on first product Successfully");
        LoggerHandler.info("clicked on first product successfully");
    }

    public void clickOnBuy(ExtentTest test)
    {
        helper.scrollwindow(200);
        helper.waitForElementToBeVisible(ProductListPageLocator.BuyNowBtn, 3);
        helper.clickAction(ProductListPageLocator.BuyNowBtn);

        test.log(Status.INFO, "clicked on Buy Now button successfully");
        LoggerHandler.info("clicked on Buy Now button successfully");
    }
    
}
