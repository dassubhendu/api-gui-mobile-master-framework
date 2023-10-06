package com.sd.driver.factory.mobile.remote;

import com.sd.driver.manager.mobile.remote.SauceLabsAndroidManager;
import com.sd.driver.manager.mobile.remote.SauceLabsIosManager;
import com.sd.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SauceLabsMobileFactory {

    private SauceLabsMobileFactory() {
    }

    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP =
            new EnumMap<>(MobilePlatformType.class);

    static {
        MAP.put(MobilePlatformType.ANDROID, SauceLabsAndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, SauceLabsIosManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        return MAP.get(mobilePlatformType).get();
    }
}
