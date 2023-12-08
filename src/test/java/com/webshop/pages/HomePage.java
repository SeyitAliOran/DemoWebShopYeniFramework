package com.webshop.pages;

import com.webshop.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(linkText = "Register")
    public WebElement registerButton;

    public void registration(){
        registerButton.click();
        BrowserUtils.waitFor(2);
    }
}
