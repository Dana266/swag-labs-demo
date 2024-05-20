package com.saucedemo.login_logout;

import com.saucedemo.coverage.BeforeAll;
import com.saucedemo.page_objects.LoginLogoutObjects;
import json_files.JSONManagement;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginWithoutUsername extends BeforeAll {

    @Test
    public void logInWithoutUsername() throws IOException {

        driver.findElement(LoginLogoutObjects.passwordField).click();
        driver.findElement(LoginLogoutObjects.passwordField).sendKeys(JSONManagement.readProperty("password"));
        driver.findElement(LoginLogoutObjects.loginButton).click();
        driver.findElement(LoginLogoutObjects.errorMessage).isDisplayed();

    }
}
