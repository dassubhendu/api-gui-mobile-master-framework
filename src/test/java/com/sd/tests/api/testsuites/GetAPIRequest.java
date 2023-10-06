package com.sd.tests.api.testsuites;

import com.sd.tests.api.apiutils.APIBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.sd.config.factory.ConfigFactory.*;

public class GetAPIRequest extends APIBase {

  @Test
  public void getAllBookings(){

    Response response = RestAssured
      .given()
          .contentType(ContentType.JSON)
          .baseUri(getAPITestDataConfig().getBaseUrl())
      .when()
          .get()
      .then()
          .assertThat()
          .statusCode(200)
          .statusLine("HTTP/1.1 200 OK")
          .header("Content-Type", "application/json; charset=utf-8")
      .extract()
      .response();

    Assert.assertTrue(response.getBody().asString().contains("bookingid"));


  }

}
