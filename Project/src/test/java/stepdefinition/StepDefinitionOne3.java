package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AvonPageActions3;
import pages.CartPageActions3;
import pages.CheckOutPageActions3;
import pages.HomePageActions3;

public class StepDefinitionOne3 {
    
    HomePageActions3 actions3 = new HomePageActions3();
    AvonPageActions3 avonPageActions3 = new AvonPageActions3();
    CartPageActions3 cartPageActions3 = new CartPageActions3();
    CheckOutPageActions3 checkOutPageActions3 = new CheckOutPageActions3();

    @Given("the user hovers on Cycle's by brand and clicks on Avon")
    public void the_user_hovers_on_cycle_s_by_brand_and_clicks_on_avon() {
        try {
            actions3.navigateToAvon(Hooks.test);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @When("the user sorts by Price ascending and compares and deletes item")
    public void the_user_sorts_by_price_ascending_and_compares_and_deletes_item() {
        try {

            avonPageActions3.sortItemsByPriceAscending(Hooks.test);
            avonPageActions3.compareItems(Hooks.test);
            avonPageActions3.addItemToCart(Hooks.test);

            cartPageActions3.increaseItemQuantity(Hooks.test);
            cartPageActions3.deleteItemFromCart(Hooks.test);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Then("the user proceeds to checkout")
    public void the_user_proceeds_to_checkout() {
        try {
            checkOutPageActions3.checkout(Hooks.test);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
