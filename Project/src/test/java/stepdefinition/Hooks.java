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
    public static ExtentTest test;
    public static ExtentReports report;

    @BeforeAll
    public static void genR(){
        report = Reporter.createReporter("Avon");
    }


    @Before
    public void openBr(Scenario sc){
        test=report.createTest(sc.getName());
        openBrowser();
    }

    @After
    public void killBrowser(){
        driver.quit();
    }

    @AfterAll
    public static void flushRep(){
        report.flush();
    }

    
}
