package com.restapi.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.restapi.base.RestBase;

import io.restassured.http.Method;

public class TC002GetSingleUser extends RestBase{
	
	@BeforeClass
	public void getSingleUser()
	{
		//httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "/api/users/2");
		
	}
	
	@Test
	public void verifyStatusCode()
	{
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	public void verifyResponseBody()
	{
		String responseBody = response.jsonPath().getString("data.first_name");
		Assert.assertEquals(responseBody, "Janet");
	}
	
	

}
