package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadPropertoes;

public class TC1_GetRequest {

	public static void main(String[] args) throws IOException {
		
		Properties p = LoadPropertoes.properties("../API_Framwork_Design/URI.properties");
HTTPMethods  gethttp = new HTTPMethods(p);
gethttp.GetRequest("QA_URI");

	}

}