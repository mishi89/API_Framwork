package org.testing.ResponseValidation;

import org.testing.Utilities.ParsingJsonUsingJsonPath;

import com.jayway.restassured.response.Response;

public class ResponseValidate {
	public static void statuscodeValidate(int ExpectedStatusCode, Response res) 
	{

		if (ExpectedStatusCode == res.getStatusCode()) {
			System.out.println("Statatus Code matched");
		} else {

			System.out.println("Status COde mismatched");
		}

	}
	
	public static void dataValidate(String expectedData,Response res, String Jsonpath)
	{
		if(expectedData.equals(ParsingJsonUsingJsonPath.parseJson(res, Jsonpath)));
	}
}
