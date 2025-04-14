package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CambioCartPageActions6;
import pages.CambioPageActions6;
import pages.CambioProductPageActions6;
import pages.HomePageActions6;

public class CambioSteps6 {
    HomePageActions6 homePageActions6=new HomePageActions6();
    CambioCartPageActions6 cambioCartPageActions6=new CambioCartPageActions6();
    CambioPageActions6 cambioPageActions6=new CambioPageActions6();
    CambioProductPageActions6 cambioProductPageActions6=new CambioProductPageActions6();

    @Given("User lands on the Avon Cycle Homepage for Cambio")
    public void user_lands_on_the_avon_cycle_homepage_for_cambio() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("user scroll down to footer and click Cambio")
    public void user_scroll_down_to_footer_and_click_cambio() {
        // Write code here that turns the phrase above into concrete actions
        homePageActions6.Cambioactions();
    }
    @When("verify page and hover on bikes")
    public void verify_page_and_hover_on_bikes() {
        // Write code here that turns the phrase above into concrete actions
        cambioPageActions6.Verifypagetitle_hoverBike();
    }
    @When("click best sellers")
    public void click_best_sellers() {
        // Write code here that turns the phrase above into concrete actions
        cambioPageActions6.clickbestSeller();
    }
    @When("scroll down and click size")
    public void scroll_down_and_click_size() {
        // Write code here that turns the phrase above into concrete actions
        cambioProductPageActions6.clickSize();
        
    }
    @When("hover on first product and click select option")
    public void hover_on_first_product_and_click_select_option() {
        // Write code here that turns the phrase above into concrete actions
        cambioProductPageActions6.hoverProductandClickselect();
    }
    @When("click add to cart")
    public void click_add_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        cambioCartPageActions6.clickCart();
    }
    @When("click view cart")
    public void click_view_cart() {
        // Write code here that turns the phrase above into concrete actions
        cambioCartPageActions6.ViewCart();
    }
    @Then("verify and screenshot")
    public void verify_and_screenshot() {
        // Write code here that turns the phrase above into concrete actions
    }
}
