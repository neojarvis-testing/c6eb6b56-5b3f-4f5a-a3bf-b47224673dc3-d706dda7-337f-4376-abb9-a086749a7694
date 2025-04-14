package utils;
 
import java.io.File;
import java.io.IOException;
 
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.google.common.io.Files;
 
 
public class Screenshot {
 
    public static TakesScreenshot ts;
 
    static public void screenShotAndHighlight(WebDriver driver,By locator,String filename)
    {
        try {
	        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	        String screenshotName = filename + "_" + timestamp + ".png";
	        WebElement captureElement =driver.findElement(locator);
	        JavascriptExecutor js=(JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', 'border:solid 5px red' );", captureElement);
	        Thread.sleep(2000);
	        TakesScreenshot ts=(TakesScreenshot) driver;
	        File fs=ts.getScreenshotAs(OutputType.FILE);
	 
	        File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
	        if (!screenshotsDir.exists()) {
	            screenshotsDir.mkdirs();
	        }
	 
	        File target = new File(screenshotsDir, screenshotName);
	        Files.copy(fs, target);
        }
 
        catch(Exception e){
        	e.printStackTrace();
        }
    }
 
    public static void captureScreenShot(String filename) 
    {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        ts = (TakesScreenshot) Base.driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
 
        // Create the screenshots directory if it doesn't exist
        File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
 
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 
 