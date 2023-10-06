package com.sd.tests.mobile.android.pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.sd.utils.PageActionsHelper.*;

public class HomeScreenAndroid {

  private static final By VIEWS_BUTTON = MobileBy.accessibilityId("Views");

  private HomeScreenAndroid(){};

  public static HomeScreenAndroid getHomeScreenInstance(){return new HomeScreenAndroid();};

  public ViewsScreenAndroid navigateToViewsScreen(){
    waitAndClick(VIEWS_BUTTON, Duration.ofSeconds(20));
    return new ViewsScreenAndroid();
  }

}
