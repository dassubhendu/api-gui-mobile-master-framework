package com.sd.tests.mobile.ios.pages;

import com.sd.utils.PageActionsHelper;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.security.PublicKey;
import java.time.Duration;

import static com.sd.utils.PageActionsHelper.*;

public class HomeScreenIOS {

  private static final By ADD_TASK = new MobileBy.ByAccessibilityId("plus.circle");

  private HomeScreenIOS(){};

  public static HomeScreenIOS getHomeScreenInstance(){return new HomeScreenIOS();};

  public CreateTaskScreenIOS clickOnAddANewTask(){
    waitAndClick(ADD_TASK, Duration.ofSeconds(20));
    return new CreateTaskScreenIOS();
  }

}
