package com.sd.tests.web.testsuites;

import com.sd.tests.web.base.WebBase;
import com.sd.tests.web.pages.LoginPage;
import org.testng.annotations.Test;

import static com.sd.config.factory.ConfigFactory.*;
import static org.testng.Assert.*;

public class LoginRegressionTestSuite extends WebBase {

    @Test(priority = 1, description = "Verify Login functionality with valid credential.")
    public void verifyLoginWithValidCredential() {
      boolean isLogoutButtonPresent = new LoginPage().
         loginIntoApplication(getWebTestDataConfig().getUserName(), getWebTestDataConfig().getPassword())
            .clickOnBurgerMenuButton()
            .isLogoutButtonPresent();
            assertTrue(isLogoutButtonPresent);
    }

    @Test(priority = 2, description = "Verify Login functionality with invalid credential.")
    public void verifyLoginWithInvalidCredential(){
      new LoginPage()
        .loginIntoApplication(getWebTestDataConfig().getWrongUserName(), getWebTestDataConfig().getWrongPassword());
        assertTrue(new LoginPage().isLoginFailureMessageDisplayed());
    }
}


