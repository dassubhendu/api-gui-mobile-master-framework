package com.sd.tests.mobile.ios.pages;


import static com.sd.utils.PageActionsHelper.*;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.time.Duration;

public class CreateTaskScreenIOS {

  private static final By DAILY_TASK_BUTTON = new MobileBy.ByAccessibilityId("Daily Tasks");

  public boolean isDailyTaskButtonIsVisible(){
    return waitAndCheckElementIsVisible(DAILY_TASK_BUTTON, Duration.ofSeconds(20));
  }

}
