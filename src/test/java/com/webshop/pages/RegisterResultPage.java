package com.webshop.pages;

import com.webshop.utilities.BrowserUtils;
import com.webshop.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterResultPage extends BasePage{
    @FindBy(xpath = "//div[@class='result']")
    public WebElement registerResult;
    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    public void verifiesRegister(){
        WebElement expectedMessage = Driver.get().findElement(By.xpath("//div[@class='result']"));
        System.out.println("expectedMessage.getText() = " + expectedMessage.getText());
        String actualMessage= expectedMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(actualMessage,"Your registration completed");
        BrowserUtils.waitFor(2);
        continueButton.click();
    }
}
