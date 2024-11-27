package com.restapi.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.restapi.base.RestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001GetAllEmpData extends RestBase{
	
	@BeforeClass
	public void getAllEmpData() throws InterruptedException
	{
		logger.info("*********Started TC001GetAllEmpData *********");
		RestAssured.baseURI = "https://www.abc.com";
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "/employees");
		
		Thread.sleep(3000);
	}
	
	@Test
	public void checkResponseBody()
	{
		logger.info("(*** Checking response body ****");
		String responseBody = response.getBody().asString();
		logger.info("*** Response body===>" + responseBody);
		Assert.assertTrue(responseBody != null);
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
