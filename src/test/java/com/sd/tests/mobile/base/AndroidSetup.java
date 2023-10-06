package com.sd.tests.mobile.base;

import com.sd.driver.Driver;
import com.sd.enums.MobilePlatformType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AndroidSetup {

    @BeforeMethod
    public void setup(){
        Driver.initDriverForMobile(MobilePlatformType.ANDROID);
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }

}
