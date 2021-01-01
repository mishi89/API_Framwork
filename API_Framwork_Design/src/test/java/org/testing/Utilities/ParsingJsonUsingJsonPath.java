package org.testing.Utilities;

import com.jayway.restassured.response.Response;

public class ParsingJsonUsingJsonPath {
	
	
	public static String parseJson(Response res ,String Jsonpath)
	{
		return res.jsonPath().getString(Jsonpath);
	}

}
