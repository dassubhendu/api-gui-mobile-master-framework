package com.sd.driver;

import com.sd.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {
    WebDriver getDriver(WebDriverData webDriverData);
}
