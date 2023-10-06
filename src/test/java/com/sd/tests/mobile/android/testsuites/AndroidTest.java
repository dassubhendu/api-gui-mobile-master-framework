package com.sd.tests.mobile.android.testsuites;

import com.sd.tests.mobile.android.pages.HomeScreenAndroid;
import com.sd.tests.mobile.base.AndroidSetup;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AndroidTest extends AndroidSetup {

    @Test
    public void verifyShakeInAnimationInViews(){
      boolean isShakeButtonIsVisible = HomeScreenAndroid.getHomeScreenInstance()
        .navigateToViewsScreen()
        .clickViewScreenElement("Animation")
        .isShakeButtonIsVisible("Shake");
        assertTrue(isShakeButtonIsVisible);
    }
}
