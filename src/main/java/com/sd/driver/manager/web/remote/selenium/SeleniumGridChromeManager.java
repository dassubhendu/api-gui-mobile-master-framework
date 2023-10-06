package com.sd.driver.manager.web.remote.selenium;

import com.sd.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridChromeManager {

    private SeleniumGridChromeManager(){};

    public static WebDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(Browser.CHROME.browserName());
        return new RemoteWebDriver(ConfigFactory.getConfig()
                .seleniumGridURL(), capabilities);

    }
}
