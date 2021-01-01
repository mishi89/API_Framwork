package org.testing.Utilities;

import java.util.regex.Pattern;

public class JsonReplacement {

	public static String jsonValueReplacement(String body, String variablename, String variablevalue) {
		body = body.replaceAll(Pattern.quote("{{" + variablename + "}}"), variablevalue);
		return body;
	}

}
