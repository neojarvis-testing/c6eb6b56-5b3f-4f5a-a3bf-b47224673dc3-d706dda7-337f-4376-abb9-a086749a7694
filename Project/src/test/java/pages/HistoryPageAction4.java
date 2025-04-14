package pages;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.HistoryPageLocator4;
import uistore.HomePageFooterLocator4;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HistoryPageAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void methodAboutUsPageOne(){
        try{
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickAboutUs, 4);
            driverHelper.clickAction(HomePageFooterLocator4.clickAboutUs);
            LoggerHandler.info("clicked on About Us");
            Hooks.test.log(Status.INFO, "clicked on About Us");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void methodAboutUsPageTwo(){
        try{
            driverHelper.scrollwindow(500);
            driverHelper.clickAction(HistoryPageLocator4.clickReadMore);
            LoggerHandler.info("clicked on Read More");
            Hooks.test.log(Status.INFO, "clicked on Read More");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

