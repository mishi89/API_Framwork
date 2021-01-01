package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static  com.jayway.restassured.RestAssured.*;

public class HTTPMethods {
	Properties pr;

	
	public HTTPMethods(Properties pr)
	{
		this.pr= pr;
	}
	
	public void getRequest(String UriKey)
	{
		Response res = given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(UriKey));
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
	
	public Response postRequest(String UriKey , String body)
	{
	Response res = 	given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty(UriKey));
		return res;
	}

}
