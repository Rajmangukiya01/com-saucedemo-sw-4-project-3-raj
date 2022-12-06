package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Utility {
    By sixProducts = By.className("inventory_item");

    public int sixProductsDisplayed() {
        List<WebElement> list = driver.findElements(sixProducts);
        return list.size();
    }
}
