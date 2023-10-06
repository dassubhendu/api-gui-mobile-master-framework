package com.sd.tests.web.base;

import com.sd.config.factory.ConfigFactory;
import com.sd.driver.Driver;
import com.sd.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class WebBase {


    @BeforeMethod(alwaysRun = true)
    public void setup(){
        Driver.initDriverForWeb();
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }

}
