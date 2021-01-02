package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadProperties;

import com.jayway.restassured.response.Response;

public class TC5_ParseAll_ID {

	public void TC5() throws IOException {

		Properties p = LoadProperties.properties("../API_Framwork_Design/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.getRequestparseallkey("QA_URI");
		System.out.println(res.asString());
		ResponseValidate.statuscodeValidate(200, res);
	}
}
