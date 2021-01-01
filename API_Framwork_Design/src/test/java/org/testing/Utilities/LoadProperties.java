package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
	public static Properties properties(String path) throws IOException {
		File file = new File(path);
		Properties pr = new Properties();
		FileInputStream instream = new FileInputStream(file);
		pr.load(instream);
		return pr;
	}

}
