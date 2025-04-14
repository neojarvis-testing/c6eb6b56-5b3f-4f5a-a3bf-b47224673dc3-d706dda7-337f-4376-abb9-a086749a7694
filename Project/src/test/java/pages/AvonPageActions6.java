package pages;
 
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
 
import uistore.AvonPageLocators6;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class AvonPageActions6 {
    WebDriver driver=Base.driver;
    WebDriverHelper helper=new WebDriverHelper(driver);
    public void verifyprice(){
        Assert.assertEquals(helper.getText(AvonPageLocators6.price_filter), "PRICE");
    }
    public void reviewaction(){
        helper.clickAction(AvonPageLocators6.review_filter);
        helper.clickAction(AvonPageLocators6.first_review);
       
    }
    public void sizeaction(){
        helper.clickAction(AvonPageLocators6.size_filter);
        helper.clickAction(AvonPageLocators6.first_size);
        
    }
    public void color_and_clear_filter(){
        helper.clickAction(AvonPageLocators6.Color_Swatches_filter);
        helper.clickAction(AvonPageLocators6.clear_filter);
        
    }
    public void sortaction(){
        helper.clickAction(AvonPageLocators6.sort_filter);
        helper.clickAction(AvonPageLocators6.first_sort);
       
    }
    public void productwaction(){
       
        helper.clickAction(AvonPageLocators6.first_product);
        Assert.assertEquals(helper.getText(AvonPageLocators6.addtocart), "ADD TO CART");
        Screenshot.captureScreenShot("Avon_Cart");
        LoggerHandler.info("verified Add to cart");
        //Reporter.attachScreenshotToReport("Avon_Cart", null, "verified Add to cart");
       
    }
}
