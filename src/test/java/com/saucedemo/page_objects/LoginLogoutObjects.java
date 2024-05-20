package com.saucedemo.page_objects;

import org.openqa.selenium.By;

public class LoginLogoutObjects {

    //logIn

    public static By usernameField = By.id("user-name");

    public static By passwordField = By.id("password");

    public static By loginButton = By.id("login-button");
    public static By products = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]");
    public static By errorMessage = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]");

    //logOut

    public static By dropMenu = By.id("react-burger-menu-btn");
    public static By logOutButton = By.id("logout_sidebar_link");
    public static By swaglabs = By.xpath("//body[1]/div[1]/div[1]/div[1]");



}
