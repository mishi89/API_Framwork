package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadJsonPayLoad {

	public static String loadJson(String path) throws FileNotFoundException {
		File file = new File(path);
		FileReader fr = new FileReader(file);
		JSONTokener js = new JSONTokener(fr);
		JSONObject jsonObject = new JSONObject(js);
		return jsonObject.toString();

	}
}
