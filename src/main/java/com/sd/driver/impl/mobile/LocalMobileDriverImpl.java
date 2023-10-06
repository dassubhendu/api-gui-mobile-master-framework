package com.sd.driver.impl.mobile;

import com.sd.driver.IMobileDriver;
import com.sd.driver.entity.MobileDriverData;
import com.sd.driver.entity.WebDriverData;
import com.sd.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.sd.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {
    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
    }
}
