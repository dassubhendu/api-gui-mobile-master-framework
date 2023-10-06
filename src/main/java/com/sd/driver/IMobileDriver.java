package com.sd.driver;

import com.sd.driver.entity.MobileDriverData;
import com.sd.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
    WebDriver getDriver(MobileDriverData driverData);
}
