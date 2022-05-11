package com.epicDMC.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class GetPropertiesValue {

	   static String filepath="config.properties";
	   public static  String getPropertyValue(String key) {
		Properties prop= new Properties();
		try {
		prop.load(new FileInputStream(new File(filepath)));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		String value = prop.getProperty(key);
		return value;
	}
		
	
}
