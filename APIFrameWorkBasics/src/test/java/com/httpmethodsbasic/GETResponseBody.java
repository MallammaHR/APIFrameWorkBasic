package com.httpmethodsbasic;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static  org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.*;

public class GETResponseBody 
{
	@Test
	public void verifyResponseBody()
	{
		Response repsonse=given()
						  .when()
						  .get("https://reqres.in/api/");
		assertEquals(RestAssured.given().get("https://reqres.in/api/users/2").getStatusCode(),equalTo(200));
							
	}
}
