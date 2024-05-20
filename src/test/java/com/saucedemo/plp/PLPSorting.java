package com.saucedemo.plp;

import com.saucedemo.functions.LoginLogoutFun;
import com.saucedemo.coverage.BeforeAll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.saucedemo.page_objects.PLPSortingObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PLPSorting extends BeforeAll {

    @Test
    public void plp() throws IOException, InterruptedException {

        LoginLogoutFun.logInValidAccount(driver, wait);
        Thread.sleep(1000);


        List<WebElement> beforeFilterPrice = driver.findElements(PLPSortingObjects.priceBeforeFilter);

        List<Double> beforeFilterPriceList = new ArrayList<>();

        for (WebElement p : beforeFilterPrice) {
            beforeFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }
        Thread.sleep(1000);

        Select dropdown = new Select(driver.findElement(PLPSortingObjects.dropdownMenu));
        dropdown.selectByVisibleText("Price (high to low)");

        List<WebElement> afterFilterPrice = driver.findElements(PLPSortingObjects.priceAfterFilter);

        List<Double> afterFilterPriceList = new ArrayList<>();

        for (WebElement p : afterFilterPrice) {
            afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }
        Thread.sleep(1000);


    }


}
