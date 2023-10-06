package com.sd.driver.manager.mobile.local;

import com.sd.config.factory.ConfigFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.WebDriver;

public final class IOSManager {

    private IOSManager(){};

    public static WebDriver getDriver(){
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 14")
                .setApp(System.getProperty("user.dir") + "/ios-app.zip");
        return new IOSDriver(ConfigFactory.getConfig().localAppiumServerURL(), options);
    }

}
