package com.sd.driver.entity;

import com.sd.enums.BrowserRemoteModeType;
import com.sd.enums.BrowserType;
import com.sd.enums.RunModeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {

    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;

}
