package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.TC2_PostRequest;

public class Trigger {
	public static void main(String[] args) throws IOException {
		
		TC2_PostRequest postrequest = new TC2_PostRequest();
		postrequest.postReq();
	}

}
