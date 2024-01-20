package com.httpmethodsbasic;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.path.json.JSONAssertion;

import static  io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;
public class PUTMethod
{
	@Test
	    public static void verifystatusCodeforPost()
	    {
	        JSONObject request = new JSONObject();
	        request.put("name", "Mallamma");
	        request.put("job", "Teacher");

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
			
	}
}
