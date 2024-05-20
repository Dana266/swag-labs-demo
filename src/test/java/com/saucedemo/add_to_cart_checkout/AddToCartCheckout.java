package com.saucedemo.add_to_cart_checkout;

import com.saucedemo.functions.LoginLogoutFun;
import com.saucedemo.page_objects.AddToCartCheckoutObjects;
import com.saucedemo.coverage.BeforeAll;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddToCartCheckout extends BeforeAll {

    @Test
    public void addToCartCheckout() throws IOException {

        LoginLogoutFun.logInValidAccount(driver,wait);

        driver.findElement(AddToCartCheckoutObjects.myItem).click();

        String myItemName = driver.findElement(AddToCartCheckoutObjects.itemName).getText();
        System.out.println(myItemName);

        driver.findElement(AddToCartCheckoutObjects.addToCartButton).click();
        driver.findElement(AddToCartCheckoutObjects.shoppingCartButton).click();

        String myItemInCart = driver.findElement(AddToCartCheckoutObjects.itemNameInCart).getText();
        System.out.println(myItemInCart);

        driver.findElement(AddToCartCheckoutObjects.checkoutButton).click();
        driver.findElement(AddToCartCheckoutObjects.firstNameField).click();
        driver.findElement(AddToCartCheckoutObjects.firstNameField).sendKeys(AddToCartCheckoutObjects.firstName);
        driver.findElement(AddToCartCheckoutObjects.lastNameField).click();
        driver.findElement(AddToCartCheckoutObjects.lastNameField).sendKeys(AddToCartCheckoutObjects.lastName);
        driver.findElement(AddToCartCheckoutObjects.postalCodeField).click();
        driver.findElement(AddToCartCheckoutObjects.postalCodeField).sendKeys(AddToCartCheckoutObjects.postalCode);
        driver.findElement(AddToCartCheckoutObjects.continueButton).click();
        driver.findElement(AddToCartCheckoutObjects.finishButton).click();
        driver.findElement(AddToCartCheckoutObjects.checkOutMessage).isDisplayed();

        Assert.assertEquals(myItemName,myItemInCart);




    }
}
