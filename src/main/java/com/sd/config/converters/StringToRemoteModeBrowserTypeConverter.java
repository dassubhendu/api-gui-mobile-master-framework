package com.sd.config.converters;

import com.sd.enums.BrowserRemoteModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteModeType> {
    @Override
    public BrowserRemoteModeType convert(Method method, String remoteMode) {
        Map<String, BrowserRemoteModeType> stringBrowserRemoteModeTypeMap = Map.of("SELNIUM", BrowserRemoteModeType.SELENIUM,
        "SELENOID", BrowserRemoteModeType.SELENOID, "BROWSER_STACK", BrowserRemoteModeType.BROWSER_STACK);
        return stringBrowserRemoteModeTypeMap.getOrDefault(remoteMode.toUpperCase(), BrowserRemoteModeType.SELENOID);
    }
}
