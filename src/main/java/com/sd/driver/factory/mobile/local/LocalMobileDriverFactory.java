package com.sd.driver.factory.mobile.local;

import com.sd.driver.manager.mobile.local.AndroidManager;
import com.sd.driver.manager.mobile.local.IOSManager;
import com.sd.driver.manager.web.local.ChromeManager;
import com.sd.driver.manager.web.local.FirefoxManager;
import com.sd.enums.BrowserType;
import com.sd.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {

    private LocalMobileDriverFactory(){};

    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatformType.class);

    static {
        MAP.put(MobilePlatformType.ANDROID, AndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, IOSManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType){
        return MAP.get(mobilePlatformType).get();
    }

}
