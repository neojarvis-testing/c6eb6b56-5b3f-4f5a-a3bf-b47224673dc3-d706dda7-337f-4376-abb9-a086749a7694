package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AvonPageActions6;
import pages.HomePageActions6;

public class AvonSteps6 {
    HomePageActions6 homePageActions6=new HomePageActions6();
    AvonPageActions6 avonPageActions6=new AvonPageActions6();
    @Given("User lands on the Avon Cycle Homepage for Avon")
    public void user_lands_on_the_avon_cycle_homepage() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("user scroll down to footer")
    public void user_scroll_down_to_footer() {
        // Write code here that turns the phrase above into concrete actions
        homePageActions6.verifybrandFooter();
    }
    @When("click cyclux and navigate Back")
    public void click_cyclux_and_navigate_back() {
        // Write code here that turns the phrase above into concrete actions
        homePageActions6.clickcyclux_navigateBack();
    }
    @When("scroll down to footer and click avon")
    public void scroll_down_to_footer_and_click_avon() {
        // Write code here that turns the phrase above into concrete actions
        homePageActions6.clickavon();
    }
    @When("verify price filter price")
    public void verify_price_filter_price() {
        // Write code here that turns the phrase above into concrete actions
        avonPageActions6.verifyprice();
    }
    @When("click on review filter and first review")
    public void click_on_review_filter_and_first_review() {
        // Write code here that turns the phrase above into concrete actions
        avonPageActions6.reviewaction();
    }
    @When("click on size filter and first size")
    public void click_on_size_filter_and_first_size() {
        // Write code here that turns the phrase above into concrete actions
        avonPageActions6.sizeaction();
    }
    @When("click on color filter and clear filter and select first sort option")
    public void click_on_color_filter_and_clear_filter() {
        // Write code here that turns the phrase above into concrete actions
        avonPageActions6.color_and_clear_filter();
        avonPageActions6.sortaction();
    }
    @Then("click first product and verify addtocart and capture screenshot")
    public void click_first_product_and_verify_addtocart_and_capture_screenshot() {
        // Write code here that turns the phrase above into concrete actions
        avonPageActions6.productwaction();
    }
}
