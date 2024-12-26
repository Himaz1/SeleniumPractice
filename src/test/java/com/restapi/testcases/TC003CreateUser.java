package com.restapi.testcases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.restapi.base.RestBase;

import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;

public class TC003CreateUser extends RestBase{
	
	@BeforeClass
	public void createUser()
	{
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "TestTom");
		requestParams.put("job", "QA");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams).toString();
		
		response = httpRequest.request(Method.POST, "/api/users");
	}
	
	@Test
	public void verifyStatusCode()
	{
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);
	}
	
	@Test
	public void verifyResponseBody()
	{
		JsonPath jsonPath = response.jsonPath();
		Assert.assertEquals(jsonPath.get("name"), "TestTom");
		Assert.assertEquals(jsonPath.get("job"), "QA");
	}

}
