package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AvonFitnessMachineActions5;
import pages.HomePageActions5;
import pages.TreadMillFirstProductActions5;
import pages.TreadMillsActions5;

public class Stepdefinition2_5 {
    @Given("User lands on the homepage2")
public void user_lands_on_the_homepage2() {
    System.out.println("Browser Opened");
    
}
@When("User clicks on Avon Fitness Machine a new window opens")
public void user_clicks_on_avon_fitness_machine_a_new_window_opens() {
     HomePageActions5.clickAvonFitnessMachine();

        AvonFitnessMachineActions5.verifyAFMurl();
    
}
@Then("User handles the pop up to hover on Domestic Gym and Cardio line")
public void user_handles_the_pop_up_to_hover_on_domestic_gym_and_cardio_line() {
    AvonFitnessMachineActions5.closePopUP();

    AvonFitnessMachineActions5.domesticGymHover();

    AvonFitnessMachineActions5.cardioLineHover();
}
@Then("User clicks on Treadmills and clicks on the first product")
public void user_clicks_on_treadmills_and_clicks_on_the_first_product() {
    AvonFitnessMachineActions5.clickTreadmills();

        TreadMillsActions5.verifyTreadMillUrl();

        TreadMillsActions5.clickOnFirstProduct();
}
@Then("User then clicks on the Enquire Now button and handles the popup")
public void user_then_clicks_on_the_enquire_now_button_and_handles_the_popup() {
    TreadMillFirstProductActions5.clickEnquireNow();
}
@Then("User inputs the values in Enquiry form")
public void user_inputs_the_values_in_enquiry_form() {
    TreadMillFirstProductActions5.inputName();

        TreadMillFirstProductActions5.inputEmail();

        TreadMillFirstProductActions5.inputNumber();

        TreadMillFirstProductActions5.inputCity();

        TreadMillFirstProductActions5.clickSubmit();
    
}
}
