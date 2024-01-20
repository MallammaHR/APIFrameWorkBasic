package com.httpmethodsbasic;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GETMethod 
{
	@Test(description="Verify status code for GET method-users/2 as 200")
	 public static void verifyStatusCodeGET() 
	{
		RestAssured.baseURI ="https://reqres.in/api/";	
		given().
			header("content-type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
		when().
			get("users/2").
		then().
			statusCode(200).log().all();
		
		//Assert  using assertThat
		//assertThat(RestAssured.given().get("users/2").getStatusCode(),equalTo(200));
			
	 }

}
