package com.sd.driver.impl.mobile;

import com.sd.driver.IMobileDriver;
import com.sd.driver.entity.MobileDriverData;
import com.sd.driver.entity.WebDriverData;
import com.sd.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.sd.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {
    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(), driverData.getMobilePlatformType());
    }
}
