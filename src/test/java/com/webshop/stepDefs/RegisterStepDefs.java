package com.webshop.stepDefs;


import com.webshop.pages.HomePage;
import com.webshop.pages.RegisterPage;
import com.webshop.pages.RegisterResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterResultPage registerResultPage=new RegisterResultPage();

    @When("The user clicks to register button and  enters personal details")
    public void the_user_clicks_to_register_button_and_enters_personal_details() {
        homePage.registration();
        registerPage.register();
    }

    @Then("The user verifies registration")
    public void the_user_verifies_registration() {
      registerResultPage.verifiesRegister();

    }

}
