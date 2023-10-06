package com.sd.driver.factory.web.remote;

import com.sd.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.sd.driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import com.sd.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {

    private SelenoidFactory(){};

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                ? SelenoidChromeManager.getDriver()
                : SelenoidFirefoxManager.getDriver();
    }
}
