package com.sd.driver.manager.mobile.remote;

import com.sd.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsAndroidManager {

    private SauceLabsAndroidManager() {
    }

    public static WebDriver getDriver() {
        //dummy code and not tested
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "11");
        capabilities.setCapability("appium:deviceName", "Samsung.*Galaxy.*");
        capabilities.setCapability("appium:orientation", "portrait");
        capabilities.setCapability("appium:app", "storage:filename=<file-name>");
        DesiredCapabilities sauceOptions = new DesiredCapabilities();
        sauceOptions.setCapability("username", ConfigFactory.getConfig().userNameSauceLab());
        sauceOptions.setCapability("accessKey", ConfigFactory.getConfig().sauceLabKey());
        capabilities.setCapability("sauce:options", sauceOptions);
        return new RemoteWebDriver(ConfigFactory.getConfig()
                .sauceLabsURL(), capabilities);
    }

}
