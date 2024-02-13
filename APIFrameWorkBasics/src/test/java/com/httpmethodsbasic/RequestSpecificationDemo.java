package com.httpmethodsbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationDemo 
{
	@Test
	public void requestSpecificationDemo()
	{
		//creating Request Specifictaion object
		RequestSpecification reqSpec=RestAssured.given();
		//System.out.println("reqSpec is :     "+reqSpec);
		
		
		//https://reqres.in/api/users?page=2
		//we need to set base URI and base path
		reqSpec.baseUri("https://reqres.in");
		reqSpec.basePath("api/users");
		
		//add query parameter
		reqSpec.queryParam("page", 2);
		
		//Add headers
		reqSpec.header("Content-Type","application/json");
		
		//We need send GET request and send the Response
		Response reponse=reqSpec.get();
		
		int status_code=reponse.getStatusCode();
		System.out.println("Status code is : "+status_code);
		
		
		Assert.assertEquals(status_code, 200,"Status code is not 200");
		
		String responseBody=reponse.getBody().asPrettyString();
						
		
		System.out.println("Response Body is  : "+responseBody);
	}
}
