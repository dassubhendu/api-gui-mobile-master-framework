package com.sd.driver.factory.web.remote;

import com.sd.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.sd.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import com.sd.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){};

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFirefoxManager.getDriver();
    }

}
