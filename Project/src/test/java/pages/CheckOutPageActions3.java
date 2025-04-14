package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.CartPageLocators3;
import uistore.CheckOutPageLocators3;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class CheckOutPageActions3 {
     WebDriverHelper helper = new WebDriverHelper(Base.driver);
 
    // Method to proceed to checkout
    public void checkout(ExtentTest test) {
        try {
            helper.clickAction(CartPageLocators3.clickOnCheckOut);
            test.log(Status.INFO,"clicked on checkout");
            LoggerHandler.info("clicked on checkout");
 
            Screenshot.captureScreenShot("Checkout");

            String exepectedUrl = ExcelReader.readCellValue("Avinash", "9", "value");
            Assertion.asserUrl(exepectedUrl, test);

            String actualAddress = helper.getText(CheckOutPageLocators3.verifySelectAddress);
            String expectedAddress = ExcelReader.readCellValue("Avinash", "1", "value");
            Assertion.asserElement(expectedAddress, actualAddress, test);
 
 
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}