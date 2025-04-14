package stepdefinition;

import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountRegisterActions5;
import pages.HomePageActions5;
import pages.LoginPageActions5;
import pages.NewLaunchesActions5;

public class stepdefinition1 {
    @Given("User lands on the homepage")
public void user_lands_on_the_homepage() {
    
}
@When("User clicks on new launches and clicks on heart icon a new window opens")
public void user_clicks_on_new_launches_and_clicks_on_heart_icon_a_new_window_opens() {
     HomePageActions5.clickOnNewLaunches();
        
        NewLaunchesActions5.verifyURL();
        
        NewLaunchesActions5.clickOnHeart();
        

        LoginPageActions5.verifyUrlLogin();

}
@Then("User inputs values in login account and clicks on Login button")
public void user_inputs_values_in_login_account_and_clicks_on_login_button() {
    LoginPageActions5.loginAccountCreds();
        
    LoginPageActions5.passwordEnter();
    
    LoginPageActions5.loginButtonClick();
    
    LoginPageActions5.verifyCredsNotMatch();

    LoginPageActions5.passwordEnter();
}
@Then("User clicks on the link to open new page")
public void user_clicks_on_the_link_to_open_new_page() {
    LoginPageActions5.clickOnNewHere();
     AccountRegisterActions5.verifyAccountRegisterUrl();
   
}
@Then("User inputs the values in the input Signup field")
public void user_inputs_the_values_in_the_input_signup_field() {
    AccountRegisterActions5.verifyFirstName();
        
        AccountRegisterActions5.inputLatName();
        
        AccountRegisterActions5.inputEmail();
        
        AccountRegisterActions5.inputPhone();
        
        AccountRegisterActions5.inputPassword();
       
   
}
@Then("User clicks on the Signup button")
public void user_clicks_on_the_signup_button() {
    AccountRegisterActions5.clickOnSignup();
    
}
}
