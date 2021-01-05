package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.TC2_PostRequest;
import org.testing.TestScripts.TC3_GetRequest_PostId_APIChaining;
import org.testing.TestScripts.TC4_PutRequest;
import org.testing.TestScripts.TC5_ParseAll_ID;

public class Trigger {
	public static void main(String[] args) throws IOException {

		/*
		 * TC2_PostRequest postrequest = new TC2_PostRequest(); postrequest.postReq();
		 * 
		 * TC3_GetRequest_PostId_APIChaining apichaining = new
		 * TC3_GetRequest_PostId_APIChaining(); apichaining.apichining();
		 */
	/*	
		TC4_PutRequest tc4 = new TC4_PutRequest();
		tc4.tc4_put();*/

		TC5_ParseAll_ID tc5 = new TC5_ParseAll_ID();
		tc5.TC5();
	}

}
