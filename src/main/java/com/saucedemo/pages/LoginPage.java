package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");
    By productsText = By.xpath("//span[text()='Products']");

    public void enterUsername(String text) {
        sendTextToElements(username, text);
    }

    public void enterPassword(String text) {
        sendTextToElements(password, text);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getProductsText() {
        return getTextFromElement(productsText);
    }
}
