package com.httpmethodsbasic;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;



public class ValidateQuerryParameter
{
	@Test
	public void verifyQueryParam()
	{
		
		Response respons =
						given().queryParam("page", "2")
						.when()
						.get("https://reqres.in/api/users");
							
		assertEquals(respons.getStatusCode(),200);
		System.out.println(respons.getBody().asString());
			
	}
}
