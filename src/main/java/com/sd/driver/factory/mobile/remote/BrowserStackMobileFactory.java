package com.sd.driver.factory.mobile.remote;

import com.sd.driver.factory.web.remote.BrowserStackFactory;
import com.sd.driver.manager.mobile.remote.BrowserStackAndroidManager;
import com.sd.driver.manager.mobile.remote.BrowserStackIOSManager;
import com.sd.enums.MobilePlatformType;
import com.sd.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackMobileFactory {

    private BrowserStackMobileFactory(){};

    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatformType.class);

    static {
        MAP.put(MobilePlatformType.ANDROID, BrowserStackAndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, BrowserStackIOSManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType){
        return MAP.get(mobilePlatformType).get();
    }

}
