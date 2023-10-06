package com.sd.tests.web.testsuites;

import com.sd.tests.web.base.WebBase;
import com.sd.tests.web.pages.LoginPage;
import org.testng.annotations.Test;

import static com.sd.config.factory.ConfigFactory.getWebTestDataConfig;
import static org.junit.Assert.*;

public class ProductRegressionTestSuite extends WebBase {

  @Test(priority = 1, description = "Verify user is able to add desired item in cart")
  public void verifyProductLabelIsVisible(){
    boolean isProductsLabelVisible = new LoginPage().
      loginIntoApplication(getWebTestDataConfig().getUserName(), getWebTestDataConfig().getPassword())
      .isProductsLabelVisible();
      assertTrue(isProductsLabelVisible);
  }

}
