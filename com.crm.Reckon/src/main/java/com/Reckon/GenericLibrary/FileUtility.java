package com.Reckon.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String readDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis =new FileInputStream(IPathConstant.filepath);
		Properties p = new Properties();
		p.load(fis); //to load the property file we have a method called load which is static method present in Properties class
		String data = p.getProperty(key); //once after loading we are fetching the data from the property file using the dynamic key value
		return data;
	}
}
