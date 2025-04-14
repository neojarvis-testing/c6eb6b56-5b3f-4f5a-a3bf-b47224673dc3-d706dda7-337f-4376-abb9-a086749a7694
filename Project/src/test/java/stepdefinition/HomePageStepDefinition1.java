package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CategoryPageAction1;
import pages.ElectricCyclePageAction1;
import pages.HomePageAction1;

public class HomePageStepDefinition1 {

    HomePageAction1 hpa = new HomePageAction1();
        ElectricCyclePageAction1 ecp = new ElectricCyclePageAction1();
        CategoryPageAction1 cpa = new CategoryPageAction1();
      
        

@Given("user hover on cycle category and click on electric cycles")
public void user_hover_on_cycle_category_and_click_on_electric_cycles() {
     hpa.hoverOnBicycleAndClickOnElectric(Hooks.test);
}

@Given("user clicks on price, review and select first value")
public void user_clicks_on_price_review_and_select_first_value() {
    ecp.clickOnPriceAndReview(Hooks.test);
   
}

@When("user clicks on size, height, age and selects first value and click color swatch")
public void user_clicks_on_size_height_age_and_selects_first_value_and_click_color_swatch() {
    ecp.clickOnFirstReviewAndClickOnSize(Hooks.test);
    ecp.clickOnFirstSizeAndClickOnSize(Hooks.test);
    ecp.clickOnAcceptCookiesAndFirstHeight(Hooks.test);
    ecp.clickOnAgeAndFirstAge(Hooks.test);
}

@When("user click on clear filter and clicks categories and clicks bicycle category")
public void user_click_on_clear_filter_and_clicks_categories_and_clicks_bicycle_category() {
 
    ecp.clickOnColorSwatchAndFirstPrice(Hooks.test);
    ecp.scrollAndClickClearFilter(Hooks.test);
    ecp.clickOnCategories(Hooks.test);
    cpa.categorySelection(Hooks.test);
   
}

@Then("user verifies bicycle category is displayed")
public void user_verifies_bicycle_category_is_displayed() {
    cpa.assertAndVerify(Hooks.test);
}

}
