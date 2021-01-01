package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadProperties;

public class TC2_PostRequest {
	public static void main(String[] args) throws IOException {
		
	JSONObject data= new JSONObject();
		data.put("First Name", "HM");
		data.put("Last Name", "Mishra");
		data.put("Address", "mZNN");
		data.put("id", "1hm");
		
		Properties p = LoadProperties.properties("../API_Framwork_Design/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		http.postRequest("QA_URI", data.toString());
		
	}

}
