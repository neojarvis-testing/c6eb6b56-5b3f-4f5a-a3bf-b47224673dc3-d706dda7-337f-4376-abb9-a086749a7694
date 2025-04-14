package pages;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.CorporateAnnualReportLocator4;
import uistore.HomePageFooterLocator4;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class CorporateAnnualReportAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void methodCorporatePageOne(){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickCorporate, 5);
            driverHelper.clickAction(HomePageFooterLocator4.clickCorporate);
            LoggerHandler.info("clicked on Corporate");
            Hooks.test.log(Status.INFO, "clicked on Corporate");
            driverHelper.waitForElementToBeVisible(HomePageFooterLocator4.clickCorporate, 5);
            driverHelper.clickAction(CorporateAnnualReportLocator4.clickFirstImage);
            driverHelper.switchWindow();
            Hooks.test.log(Status.PASS, "switch to new tab");
            Reporter.attachScreenshotToReport("annual_reports", Hooks.test, "ss captured");
            String CorporateExpectedUrl = ExcelReader.readCellValue("Varsha", "9", "value");
            Assertion.asserUrl(CorporateExpectedUrl, Hooks.test);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
