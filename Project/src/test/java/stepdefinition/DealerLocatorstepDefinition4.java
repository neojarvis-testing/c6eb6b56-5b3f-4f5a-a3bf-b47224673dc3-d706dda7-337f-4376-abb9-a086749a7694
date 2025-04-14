package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageFooterAction4;
import pages.HomePageHeaderAction4;

public class DealerLocatorstepDefinition4 {

    HomePageHeaderAction4 action = new HomePageHeaderAction4();
    HomePageFooterAction4 action1 = new HomePageFooterAction4();

    @When("User click on Awards")
    public void user_click_on_awards() {
        action1.methodAwards();
    }

    @Then("User verify Awards page url")
    public void user_verify_awards_page_url() {
        System.out.println("Awards Page URL Verified");
    }

    @Then("User click on Blogs")
    public void user_click_on_blogs() {
        action1.methodBlogs();
    }

    @Then("User verify blog page url")
    public void user_verify_blog_page_url() {
        System.out.println("Blogs Page Url Verified");
    }

    @Then("User click on Warranty Policy")
    public void user_click_on_warranty_policy() {
        action1.methodWarrantyPolicy();
    }

    @Then("User verify Warranty page url")
    public void user_verify_warranty_page_url() {
        System.out.println("Warrenty Page url Verified");
    }

    @Then("User click on Terms and Conditions")
    public void user_click_on_terms_and_conditions() {
        action1.methodTermsandConditions();
    }

    @Then("User verfiy Term and Condition page url")
    public void user_verfiy_term_and_condition_page_url() {
        System.out.println("Terms and Condition Page Verified");
    }

    @Then("User click on Dealer Locator")
    public void user_click_on_dealer_locator() {
        action.methodDealerLocatorPageOne();
    }

    @Then("User select State and City")
    public void user_select_state_and_city() {
        action.methodDealerLocatorPageTwo();
    }

}
