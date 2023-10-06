package com.sd.driver.factory.web.remote;

import com.sd.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.sd.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.sd.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.sd.driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import com.sd.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackFactory {

    private BrowserStackFactory(){};

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver()
                : BrowserStackFirefoxManager.getDriver();
    }

}
