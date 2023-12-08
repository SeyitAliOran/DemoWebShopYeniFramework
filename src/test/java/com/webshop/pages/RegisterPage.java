package com.webshop.pages;

import com.github.javafaker.Faker;
import com.webshop.utilities.BrowserUtils;
import com.webshop.utilities.ConfigurationReader;
import com.webshop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(id = "gender-male")
    public WebElement genderButton;
    @FindBy(id = "FirstName")
    public WebElement firstNameArea;
    @FindBy(id = "LastName")
    public WebElement lastNameArea;
    @FindBy(id = "Email")
    public WebElement emailArea;
    @FindBy(id = "Password")
    public WebElement passwordArea;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordArea;
    @FindBy(id = "register-button")
    public WebElement registerButton;

    public void register() {
        faker = new Faker();
        genderButton.click();
        firstNameArea.sendKeys(faker.name().firstName());
        lastNameArea.sendKeys(faker.name().lastName());
        String username = faker.name().username();
        String domain = faker.internet().domainName();
        String email = username + "@" + domain;
        System.out.println("E-posta adresi " + email);
        emailArea.sendKeys(email);
        passwordArea.sendKeys(ConfigurationReader.get("password"));
        confirmPasswordArea.sendKeys(ConfigurationReader.get("password"));
        registerButton.click();


    }

}

