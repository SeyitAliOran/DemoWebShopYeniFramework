package com.webshop.stepDefs;

import com.webshop.pages.LoginPage;
import com.webshop.utilities.ConfigurationReader;
import com.webshop.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("The user navigates to the website")
    public void the_user_navigates_to_the_website() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user clicks to login button")
    public void the_user_clicks_to_login_button() {
        loginPage.login_Btn.click();
    }


    @And("The user  enters email and password")
    public void theUserEntersEmailAndPassword() {
        loginPage.login();
    }
}
