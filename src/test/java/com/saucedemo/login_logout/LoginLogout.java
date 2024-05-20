package com.saucedemo.login_logout;

import com.saucedemo.functions.LoginLogoutFun;
import com.saucedemo.coverage.BeforeAll;
import org.testng.annotations.Test;


import java.io.IOException;



public class LoginLogout extends BeforeAll {

    @Test
    public void logInLogOut() throws IOException, InterruptedException {

        LoginLogoutFun.logInValidAccount(driver,wait);
        Thread.sleep(1000);

        LoginLogoutFun.logOutValidAccount(driver,wait);
    }
}
