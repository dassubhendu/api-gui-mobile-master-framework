package com.sd.utils;

import com.sd.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageActionsHelper {

    private PageActionsHelper() {
    }

    public static void waitAndClearText(By by, Duration timeOut){
        new WebDriverWait(DriverManager.getDriver(), timeOut)
            .until(ExpectedConditions.visibilityOfElementLocated(by)).clear();
    }

    public static void waitAndEnterText(By by, String value, Duration timeOut) {
        new WebDriverWait(DriverManager.getDriver(), timeOut)
            .until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(value);
    }

    public static void waitAndClick(By by, Duration timeOut) {
        new WebDriverWait(DriverManager.getDriver(), timeOut)
            .until(ExpectedConditions.presenceOfElementLocated(by)).click();
    }

    public static boolean waitAndCheckElementIsVisible(By by, Duration timeOut){
        return new WebDriverWait(DriverManager.getDriver(), timeOut)
            .until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
    }

    public static String waitAndGetText(By by, Duration timeOut){
        return new WebDriverWait(DriverManager.getDriver(), timeOut)
             .until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
   }

}
