package com.sd.config.converters;

import com.sd.enums.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeType> {
    @Override
    public RunModeType convert(Method method, String runMode) {
        Map<String, RunModeType> stringRunModeBrowserTypeMap = Map.of("LOCAL", RunModeType.LOCAL,
        "REMOTE", RunModeType.REMOTE);
        return stringRunModeBrowserTypeMap.getOrDefault(runMode.toUpperCase(), RunModeType.LOCAL);
    }
}
