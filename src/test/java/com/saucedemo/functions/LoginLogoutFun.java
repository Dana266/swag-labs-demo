package com.saucedemo.functions;

import com.saucedemo.page_objects.LoginLogoutObjects;
import json_files.JSONManagement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class LoginLogoutFun {

    public static void logInValidAccount(WebDriver driver, WebDriverWait wait) throws IOException {

        driver.findElement(LoginLogoutObjects.usernameField).click();
        driver.findElement(LoginLogoutObjects.usernameField).sendKeys(JSONManagement.readProperty("standardUser"));
        driver.findElement(LoginLogoutObjects.passwordField).click();
        driver.findElement(LoginLogoutObjects.passwordField).sendKeys(JSONManagement.readProperty("password"));
        driver.findElement(LoginLogoutObjects.loginButton).click();
        driver.findElement(LoginLogoutObjects.products).isDisplayed();
    }

    public static void logOutValidAccount(WebDriver driver,WebDriverWait wait) {

        driver.findElement(LoginLogoutObjects.dropMenu).click();
        driver.findElement(LoginLogoutObjects.logOutButton).click();
        driver.findElement(LoginLogoutObjects.swaglabs).isDisplayed();

    }
}
