package com.saucedemo.page_objects;

import org.openqa.selenium.By;

public class AddToCartCheckoutObjects {

    public static By myItem = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]");
    public static By itemName = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    public static By addToCartButton = By.id("add-to-cart");
    public static By shoppingCartButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]/span[1]");
    public static By itemNameInCart = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]");
    public static By checkoutButton = By.id("checkout");
    public static By firstNameField = By.id("first-name");
    public static String firstName = "Danijela";
    public static By lastNameField = By.id("last-name");
    public static String lastName = "Stojkovic";
    public static By postalCodeField = By.id("postal-code");
    public static String postalCode = "11000";
    public static By continueButton = By.id("continue");
    public static By finishButton = By.id("finish");
    public static By checkOutMessage = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/h2[1]");
}
