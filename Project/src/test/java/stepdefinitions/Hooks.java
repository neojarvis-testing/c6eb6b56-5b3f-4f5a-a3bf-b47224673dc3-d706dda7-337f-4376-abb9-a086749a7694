package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base {

    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeAll
    public static void configReport()
    {
        try{
            reports = Reporter.createReporter("AvoncyclesTest_Report");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Before
    public void configBrowser(Scenario sc)
    {
        try{
            openBrowser();
            test = reports.createTest(sc.getName());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @After
    public void freeResources()
    {
        driver.quit();
    }

    @AfterAll
    public static void flushReport()
    {
        reports.flush();
    }
    
}
