package org.web.automation.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String applicationConfigReader(String key) throws IOException {
		
	
		
		File f = new File("C:/Users/odibo ovie/Java/Selenium/EcommerceProject/src/main/java/configurationFile/ApplicationConfig.properties");
		
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		
		prop.load(fr);  //property file is loaded
          return  prop.get(key).toString();
	
	}

}
