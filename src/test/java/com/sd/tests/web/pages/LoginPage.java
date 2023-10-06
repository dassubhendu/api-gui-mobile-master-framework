package com.sd.tests.web.pages;

import org.openqa.selenium.By;

import java.time.Duration;

import static com.sd.utils.PageActionsHelper.*;

public class LoginPage {

    private static final By USER_NAME_TEXT_BOX = By.id("user-name");
    private static final By PASSWORD_TEXT_BOX = By.id("password");
    private static final By LOGIN_BUTTON = By.id("login-button");
    private static final By LOGIN_ERROR_MESSAGE = By.xpath("//div[@class='error-message-container error']");

    public LoginPage(){};

    private LoginPage clearUsernameTextBox(){
        waitAndClearText(USER_NAME_TEXT_BOX, Duration.ofSeconds(20));
        return this;
    }

    private LoginPage enterUsernameTextBox(String username){
        waitAndEnterText(USER_NAME_TEXT_BOX, username, Duration.ofSeconds(20));
        return this;
    }

    private LoginPage clearPasswordTextBox(){
        waitAndClearText(PASSWORD_TEXT_BOX, Duration.ofSeconds(20));
        return this;
    }

    private LoginPage enterPasswordTextBox(String password){
        waitAndEnterText(PASSWORD_TEXT_BOX, password, Duration.ofSeconds(20));
        return this;
    }

    private ProductPage clickOnLoginButton(){
        waitAndClick(LOGIN_BUTTON, Duration.ofSeconds(20));
        return new ProductPage();
    }

    public ProductPage loginIntoApplication(String username, String password){
        return clearUsernameTextBox()
                .enterUsernameTextBox(username)
                .clearPasswordTextBox()
                .enterPasswordTextBox(password)
                .clickOnLoginButton();
    }

    public boolean isLoginFailureMessageDisplayed(){
      return waitAndCheckElementIsVisible(LOGIN_ERROR_MESSAGE, Duration.ofSeconds(20));
    }

}
