package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadProperties;

import com.jayway.restassured.response.Response;

public class TC4_PutRequest {

	public void tc4_put() throws IOException {
		JSONObject data = new JSONObject();
		data.put("First Name", "HM1");
		data.put("Last Name", "Mishra");
		data.put("Address", "mZNN");
		data.put("id", TC2_PostRequest.idValue);
		Properties p = LoadProperties.properties("../API_Framwork_Design/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.putRequest(data.toString(), "QA_URI", TC2_PostRequest.idValue);
		ResponseValidate.statuscodeValidate(201, res);
		//ResponseValidate.dataValidate("HM1", res, "First Name");

	}
}
