package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base {

    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeAll
    public static void reportInitialization() {

    }

    @Before
    public void browserInitialization() {
        openBrowser();
        // test = reports.createTest("Pills");
        // System.out.println("Browser Started");
    }

    @After
    public void browserTeardown() {
        driver.quit();
        //System.out.println("Browser Quited");
    }

    @AfterAll
    public static void closeReportResources() {
        //reports.flush();
    }

}
