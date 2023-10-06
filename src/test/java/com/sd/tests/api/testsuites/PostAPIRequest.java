package com.sd.tests.api.testsuites;

import com.sd.tests.api.apiutils.APIBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static com.sd.config.factory.ConfigFactory.getAPITestDataConfig;

public class PostAPIRequest extends APIBase {

  @Test
  public void createBooking(){

    JSONObject booking = new JSONObject();
    JSONObject bookingDates = new JSONObject();

    booking.put("firstname", "Subhendu");
    booking.put("lastname", "Das");
    booking.put("totalprice", 1000);
    booking.put("depositpaid", true);
    booking.put("additionalneeds", "breakfast");
    booking.put("bookingdates", bookingDates);

    bookingDates.put("checkin", "2023-03-25");
    bookingDates.put("checkout", "2023-03-30");

    Response response = RestAssured
      .given()
          .contentType(ContentType.JSON)
          .body(booking.toString())
          .baseUri(getAPITestDataConfig().getBaseUrl())
      .when()
          .post()
      .then()
          .assertThat()
          .statusCode(200)
          .body("booking.firstname", Matchers.equalTo("Subhendu"))
          .body("booking.totalprice", Matchers.equalTo(1000))
          .body("booking.bookingdates.checkin", Matchers.equalTo("2023-03-25"))
      .extract()
          .response();

    int bookingId = response.path("bookingid");

    RestAssured
      .given()
          .contentType(ContentType.JSON)
          .pathParams("bookingID", bookingId)
          .baseUri(getAPITestDataConfig().getBaseUrl())
      .when()
          .get("{bookingID}")
      .then()
      .assertThat()
      .statusCode(200)
      .body("firstname", Matchers.equalTo("Subhendu"))
      .body("lastname", Matchers.equalTo("Das"));
  }

}
