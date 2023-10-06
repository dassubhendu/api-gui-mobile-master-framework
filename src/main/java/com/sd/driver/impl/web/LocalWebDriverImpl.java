package com.sd.driver.impl.web;

import com.sd.driver.IWebDriver;
import com.sd.driver.entity.WebDriverData;
import com.sd.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}
