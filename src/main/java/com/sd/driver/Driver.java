package com.sd.driver;

import static com.sd.config.factory.ConfigFactory.*;

import com.sd.config.factory.ConfigFactory;
import com.sd.driver.entity.MobileDriverData;
import com.sd.driver.entity.WebDriverData;
import com.sd.driver.factory.DriverFactory;
import com.sd.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class Driver {

    private Driver(){};

    public static void initDriverForWeb(){
        if(Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
            WebDriver driver = DriverFactory.getDriverForWeb(getConfig().browserRunMde()).getDriver(driverData);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            loadURL();
        }
    }

    public static void loadURL(){
      System.out.println("The URL is being fetched: " + ConfigFactory.getWebTestDataConfig().getWebUrl());
        DriverManager.getDriver().get(ConfigFactory.getWebTestDataConfig().getWebUrl());
    }

    public static void initDriverForMobile(MobilePlatformType mobilePlatformType){
        MobileDriverData driverData = new MobileDriverData(mobilePlatformType, getConfig().mobileRemoteMode());
        WebDriver driver = DriverFactory.getDriverForMobile(getConfig().browserRunMde()).getDriver(driverData);
        DriverManager.setDriver(driver);
    }

    public static void quitDriver(){
            if(Objects.nonNull(DriverManager.getDriver())) {
                DriverManager.getDriver().quit();
                DriverManager.unload();
            }
    }

}
