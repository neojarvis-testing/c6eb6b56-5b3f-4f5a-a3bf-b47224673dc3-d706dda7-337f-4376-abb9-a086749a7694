package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPageAction;
import pages.HomePageAction;
import pages.ProductListPageAction;
import utils.Base;

public class TestCaseOnestepdefinition {

    HomePageAction performHomePageAction = new HomePageAction(Base.driver);
    CheckoutPageAction performCheckoutPageAction = new CheckoutPageAction(Base.driver);
    ProductListPageAction performProductPageAction = new ProductListPageAction(Base.driver);

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        
    }

    @When("user search for given value")
    public void user_search_for_given_value(io.cucumber.datatable.DataTable dataTable) {
        List<String> list = dataTable.asList();

        performHomePageAction.clickOnsearchIcon(Hooks.test);
        performHomePageAction.SearchForValue(Hooks.test, list.get(0));
    }

    @Then("user will be redirected to Product list Page")
    public void user_will_be_redirected_to_product_list_page() {
        
    }

    @When("user click on the first Product")
    public void user_click_on_the_first_product() {
        performProductPageAction.clickOnProduct(Hooks.test);
    }

    @Then("user will be redirected to product Page")
    public void user_will_be_redirected_to_product_page() {
        
    }

    @When("user will click on the Buy Now button")
    public void user_will_click_on_the_buy_now_button() {
        performProductPageAction.clickOnBuy(Hooks.test);
    }

    @Then("user will be redirected to checkout Page")
    public void user_will_be_redirected_to_checkout_page() {

    }

    @When("user fill all the details")
    public void user_fill_all_the_details(io.cucumber.datatable.DataTable dataTable) {
        
        List<String> list = dataTable.asList();

        performCheckoutPageAction.enterFirstName(Hooks.test, list.get(0));
        performCheckoutPageAction.enterLastName(Hooks.test, list.get(1));
        performCheckoutPageAction.enterEmail(Hooks.test, list.get(2));
        performCheckoutPageAction.enterPhone(Hooks.test, list.get(3));
        performCheckoutPageAction.enterPostCode(Hooks.test, list.get(4));
        performCheckoutPageAction.enterState(Hooks.test, list.get(5));
        performCheckoutPageAction.enterCity(Hooks.test, list.get(6));
        performCheckoutPageAction.enterAddress(Hooks.test, list.get(7));
        
        performCheckoutPageAction.applyCoupon(Hooks.test, list.get(8));
    }

    @When("click on Razorpay")
    public void click_on_razorpay() {
        
        performCheckoutPageAction.clickOnPaymentGateway(Hooks.test);
    }

    @When("click on CONFIRM CHECKOUT button")
    public void click_on_confirm_checkout_button() {
        performCheckoutPageAction.clickOnConfirmCheckout(Hooks.test);
    }

    @Then("user will redirected to to page having PROCEED TO PAYMENT button")
    public void user_will_redirected_to_to_page_having_proceed_to_payment_button() {
        
    }

}
