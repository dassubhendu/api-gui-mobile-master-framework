package com.sd.tests.api.testsuites;

import com.jayway.jsonpath.JsonPath;
import com.sd.tests.api.apiutils.FileNameConstants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONArray;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.sd.config.factory.ConfigFactory.getAPITestDataConfig;
import java.io.File;
import java.io.IOException;

public class PostAPIRequestUsingFile {

  @Test
  public void postAPIRequest() {
    try{
      String postAPIRequestBody = FileUtils.readFileToString(new File(FileNameConstants.POST_API_REQUEST_BODY), "UTF-8");
      Response response = RestAssured
        .given()
          .contentType(ContentType.JSON)
          .body(postAPIRequestBody)
          .baseUri(getAPITestDataConfig().getBaseUrl())
        .when()
          .post()
        .then()
          .assertThat()
          .statusCode(200)
        .extract()
          .response();

      JSONArray jsonArray = JsonPath.read(response.body().asString(), "$.booking..firstname");
      String firstName = (String) jsonArray.get(0);

      Assert.assertEquals(firstName, "Sachin");

      JSONArray jsonArrayLastName = JsonPath.read(response.body().asString(), "$.booking..lastname");
      String lastName = (String) jsonArrayLastName.get(0);

      Assert.assertEquals(lastName, "Tendulkar");

      JSONArray jsonArrayCheckIn = JsonPath.read(response.body().asString(), "$.booking.bookingdates..checkin");
      String checkIn = (String) jsonArrayCheckIn.get(0);

      Assert.assertEquals(checkIn, "2018-01-01");


    }catch (Exception e){
      e.printStackTrace();
    }
  }

}
