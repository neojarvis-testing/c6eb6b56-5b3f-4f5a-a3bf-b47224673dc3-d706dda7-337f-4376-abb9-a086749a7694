package stepdefinition;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.Reporter;
 
public class Hooks extends Base{
   
 
    public static ExtentReports reports;
    public static ExtentTest test;
 
    @BeforeAll
    public static void reportConfig(){
        reports = Reporter.createReporter("Avon Cycle");
    }
 
    @Before
    public void initConfig(Scenario sc){
        test = reports.createTest(sc.getName());
        openBrowser();
    }
 
 
 
    @After
    public void endConfig(){
        if(driver!=null) driver.quit();
    }
 
    @AfterAll
    public static void reportEnd(){
        reports.flush();
    }
}
 