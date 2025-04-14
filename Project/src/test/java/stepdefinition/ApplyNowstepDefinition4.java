package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CareerPageAction4;
import pages.CorporateAnnualReportAction4;
import pages.HistoryPageAction4;
import pages.HomePageFooterAction4;

public class ApplyNowstepDefinition4 {

    CareerPageAction4 action = new CareerPageAction4();
    HomePageFooterAction4 action1 = new HomePageFooterAction4();
    HistoryPageAction4 action2 = new HistoryPageAction4();
    CorporateAnnualReportAction4 action3 = new CorporateAnnualReportAction4();

    @When("User click on About Us")
    public void user_click_on_about_us() {
        action2.methodAboutUsPageOne();
    }

    @Then("User click on Read More")
    public void user_click_on_read_more() {
        action2.methodAboutUsPageTwo();
    }

    @Then("User click on Production")
    public void user_click_on_production() {
        action1.methodProduction();
    }

    @Then("User verfiy Production page title")
    public void user_verfiy_production_page_title() {
        System.out.println("Production Page Title Verified");
    }

    @Then("User click on Career")
    public void user_click_on_career() {
        action.methodCareerPageOne();
    }

    @Then("User click on Apply Now")
    public void user_click_on_apply_now() {
        action.methodCareerPageTwo();
    }

    @Then("User click on Life at Avon")
    public void user_click_on_life_at_avon() {
        action1.methodLiveAtAvon();
    }

    @Then("User verify Life at Avon page title")
    public void user_verify_life_at_avon_page_title() {
        System.out.println("Life at Avon Page Title Verified");
    }

    @Then("User click on Corporate")
    public void user_click_on_corporate() {
        action3.methodCorporatePageOne();
    }

    @Then("User click on Annual Report Image")
    public void user_click_on_annual_report_image() {
        System.out.println("Clicked on Annual Report");
    }

}
