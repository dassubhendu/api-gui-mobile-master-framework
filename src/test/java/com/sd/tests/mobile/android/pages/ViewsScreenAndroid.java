package com.sd.tests.mobile.android.pages;

import static com.sd.utils.PageActionsHelper.*;

import io.appium.java_client.MobileBy;

import java.time.Duration;

public class ViewsScreenAndroid {

  private static final String VIEW_SCREEN_ELEMENT = "%s";

  public AnimationScreenAndroid clickViewScreenElement(String elementName){
    String accessibilityId = String.format(VIEW_SCREEN_ELEMENT, elementName);
    waitAndClick(MobileBy.accessibilityId(accessibilityId), Duration.ofSeconds(20));
    return new AnimationScreenAndroid();
  }

}
