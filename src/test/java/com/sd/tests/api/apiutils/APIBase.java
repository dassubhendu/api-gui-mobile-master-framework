package com.sd.tests.api.apiutils;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class APIBase {

  @BeforeMethod
  public void setup(){
    RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
  }

}
