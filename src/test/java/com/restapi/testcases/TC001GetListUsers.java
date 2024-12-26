package com.restapi.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.restapi.base.RestBase;

import io.restassured.http.Method;

public class TC001GetListUsers extends RestBase{
	
	@BeforeClass
	public void getListUsers() throws InterruptedException
	{
		logger.info("*********Started TC001GetAllEmpData *********");
		//RestAssured.baseURI = "https://www.abc.com";
		//httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "/api/users?page=2");
		
		Thread.sleep(3000);
	}
	
	@Test
	public void checkResponseBody()
	{
		logger.info("(*** Checking response body ****");
		String responseBody = response.getBody().asString();
		logger.info("*** Response body===>" + responseBody);
		Assert.assertTrue(responseBody != null);
		
		// Extract the first name from the JSON response
		String id = response.jsonPath().getString("data[0].id");
        String firstName = response.jsonPath().getString("data[0].first_name");

        Assert.assertEquals(id, "7", "Id should be 7");
        // Assert that the first name is "Michael"
        Assert.assertEquals(firstName, "Michael", "First name should be Michael");
	}
	
	@Test
	public void checkStatusCode()
	{
		logger.info("*** Checking status code ***");
		int statusCode = response.getStatusCode();
		logger.info("*** Status code===>" + statusCode);
		Assert.assertEquals(statusCode, 200);
	}

}
