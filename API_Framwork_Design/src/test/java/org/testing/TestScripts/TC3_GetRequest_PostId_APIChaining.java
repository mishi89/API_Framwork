package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadProperties;

public class TC3_GetRequest_PostId_APIChaining {

	//get id from test case 2 post request then we user that id for get value ----------//
	
	
	public void apichining() throws IOException
	{
		Properties p = LoadProperties.properties("../API_Framwork_Design/URI.properties");
		HTTPMethods gethttp = new HTTPMethods(p);
		gethttp.getRequest_postid_apichanining("QA_URI", TC2_PostRequest.idValue);
	}
}
