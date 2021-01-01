package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JsonReplacement;
import org.testing.Utilities.LoadJsonPayLoad;
import org.testing.Utilities.LoadProperties;

public class TC2_PostRequest {

//-----------------------------------Using Org.Json------------------------------//		
	/*
	 * JSONObject data= new JSONObject(); data.put("First Name", "HM");
	 * data.put("Last Name", "Mishra"); data.put("Address", "mZNN"); data.put("id",
	 * "1hm");
	 * 
	 * Properties p =
	 * LoadProperties.properties("../API_Framwork_Design/URI.properties");
	 * HTTPMethods http = new HTTPMethods(p); http.postRequest("QA_URI",
	 * data.toString());
	 */

//-------------------------Using Json File-----------------------------------------------------------------		

	public void postReq() throws IOException {
		Random random = new Random();
		Integer ran_id = random.nextInt();
		Properties p = LoadProperties.properties("../API_Framwork_Design/URI.properties");
		String body = LoadJsonPayLoad.loadJson("../API_Framwork_Design/src/test/java/org/testing/Payloads/body.json");
		body = JsonReplacement.jsonValueReplacement(body, "id", ran_id.toString());
		HTTPMethods postmethodhit = new HTTPMethods(p);
		postmethodhit.postRequest("QA_URI", body);
	}

}
