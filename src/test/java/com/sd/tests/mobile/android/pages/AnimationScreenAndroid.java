package com.sd.tests.mobile.android.pages;

import static com.sd.utils.PageActionsHelper.*;

import io.appium.java_client.MobileBy;

import java.time.Duration;

public class AnimationScreenAndroid {

  private static final String ANIMATION_SCREEN_ELEMENT = "%s";

  public boolean isShakeButtonIsVisible(String elementName){
    String accessibilityId = String.format(ANIMATION_SCREEN_ELEMENT, elementName);
    return waitAndCheckElementIsVisible(MobileBy.accessibilityId(accessibilityId), Duration.ofSeconds(20));
  }



}
