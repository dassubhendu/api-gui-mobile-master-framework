package com.sd.driver.entity;

import com.sd.enums.MobilePlatformType;
import com.sd.enums.MobileRemoteModeType;
import com.sd.enums.RunModeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {

    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;

}
