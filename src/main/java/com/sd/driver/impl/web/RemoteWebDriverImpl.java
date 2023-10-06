package com.sd.driver.impl.web;

import com.sd.driver.IWebDriver;
import com.sd.driver.entity.WebDriverData;
import com.sd.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
    }
}
