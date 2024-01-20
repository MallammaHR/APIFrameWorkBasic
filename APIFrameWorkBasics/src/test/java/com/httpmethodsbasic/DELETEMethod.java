package com.httpmethodsbasic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class DELETEMethod 
{
	@Test
	public void verifyTheStatusCodeOfDelete()
	{
		RestAssured.baseURI="https://reqres.in/api";
		
		given().
		when()
			.delete("/users/2").
		then()
			.statusCode(204).log().all();
	}
}
