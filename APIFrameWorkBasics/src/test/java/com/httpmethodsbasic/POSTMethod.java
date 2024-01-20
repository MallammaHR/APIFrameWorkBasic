package com.httpmethodsbasic;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static  io.restassured.RestAssured.*;

public class POSTMethod 
{
	    @Test
	    public static void verifystatusCodeforPost()
	    {
	        JSONObject request = new JSONObject();
	        request.put("name", "Mallamma");
	        request.put("job", "QA");

	        RestAssured.baseURI = "https://reqres.in/api/";

			given().
			header("contet-type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON)
	            .body(request.toJSONString())
	        .when()
	            .post("users")
	        .then()
	            .statusCode(201)
	            .log().all();

	        // Assert using assertThat
	       // assertThat(given().post("users").getStatusCode(), equalTo(415));
			
	}
}
