package com.webshop.pages;

import com.github.javafaker.Faker;
import com.webshop.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    Faker faker;
    public BasePage() {PageFactory.initElements(Driver.get(), this);}

}
