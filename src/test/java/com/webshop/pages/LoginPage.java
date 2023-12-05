package com.webshop.pages;

import com.webshop.utilities.BrowserUtils;
import com.webshop.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement login_Btn;
    @FindBy(id = "Email")
    public WebElement useremail;

    @FindBy(id = "Password")
    public WebElement userpassword;
    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//li[text()='No customer account found']")
    public WebElement errorMsj1;
    @FindBy(xpath = "//span[.='Login was unsuccessful. Please correct the errors and try again.']")
    public WebElement errorMsj2;


    public void login(){
        useremail.sendKeys(ConfigurationReader.get("email"));
        userpassword.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
        BrowserUtils.waitFor(2);

    }
}
