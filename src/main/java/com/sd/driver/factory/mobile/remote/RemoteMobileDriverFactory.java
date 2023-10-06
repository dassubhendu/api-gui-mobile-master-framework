package com.sd.driver.factory.mobile.remote;

import com.sd.driver.factory.web.remote.BrowserStackFactory;
import com.sd.driver.factory.web.remote.SeleniumGridFactory;
import com.sd.driver.factory.web.remote.SelenoidFactory;
import com.sd.enums.BrowserRemoteModeType;
import com.sd.enums.BrowserType;
import com.sd.enums.MobilePlatformType;
import com.sd.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory(){};

    private static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> MAP =
            new EnumMap<>(MobileRemoteModeType.class);

    static {
        //MAP.put(MobileRemoteModeType.SAUCE_LAB, SauceLabFactory::getDriver);
        MAP.put(MobileRemoteModeType.BROWSER_STACK, BrowserStackMobileFactory::getDriver);
    }

    public static WebDriver getDriver(MobileRemoteModeType mobileRemoteModeType, MobilePlatformType mobilePlatformType){
        return MAP.get(mobileRemoteModeType).apply(mobilePlatformType);
    }

}
