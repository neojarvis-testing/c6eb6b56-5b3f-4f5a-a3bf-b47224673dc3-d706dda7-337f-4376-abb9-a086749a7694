package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BusinessPageActions3;
import pages.HomePageActions3;

public class StepDefinitionTwo3 {

    HomePageActions3 actions3 = new HomePageActions3();
    BusinessPageActions3 businessPageActions3 = new BusinessPageActions3();

    @Given("the user navigates to the International Business section")
    public void the_user_navigates_to_the_international_business_section() {
        actions3.navigateToInternationalBusiness(Hooks.test);

    }

    @When("the user fills  out the form fields with {string} and  {string} and {string} and  {string} and {string} and {string} and {string}")
    public void the_user_fills_out_the_form_fields_with_and_and_and_and_and_and(String string, String string2,
            String string3, String string4, String string5, String string6, String string7) {
        businessPageActions3.contactForm(Hooks.test,string);
        businessPageActions3.inputPhno(Hooks.test,string2);
        businessPageActions3.inputCountry(Hooks.test,string3);
        businessPageActions3.inputCompany(Hooks.test,string4);
        businessPageActions3.inputAddressField(Hooks.test,string5);
        businessPageActions3.inputSubjectField(Hooks.test,string6);
        businessPageActions3.inputMsg(Hooks.test,string7);

        

    }


}
