package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.TC2_PostRequest;
import org.testing.TestScripts.TC3_GetRequest_PostId_APIChaining;

public class Trigger {
	public static void main(String[] args) throws IOException {
		
		TC2_PostRequest postrequest = new TC2_PostRequest();
		postrequest.postReq();
		
		TC3_GetRequest_PostId_APIChaining apichaining  = new TC3_GetRequest_PostId_APIChaining();
		apichaining.apichining();
	}

}
