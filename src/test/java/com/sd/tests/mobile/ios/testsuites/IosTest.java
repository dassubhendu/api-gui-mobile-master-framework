package com.sd.tests.mobile.ios.testsuites;

import com.sd.tests.mobile.base.AndroidSetup;
import com.sd.tests.mobile.base.IOSSetup;
import com.sd.tests.mobile.ios.pages.HomeScreenIOS;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IosTest extends IOSSetup {

    @Test
    public void verifyPresenceOfDailyTask(){
      boolean isDailyTaskButtonIsVisible = HomeScreenIOS.getHomeScreenInstance()
        .clickOnAddANewTask()
        .isDailyTaskButtonIsVisible();
      assertTrue(isDailyTaskButtonIsVisible);


    }

}
