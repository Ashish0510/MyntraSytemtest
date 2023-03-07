package utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile {
	Properties properties;
	public ReadPropertyFile() {
	try {
    properties = new Properties();
    File file =new File("./Configuration/PropertyMyntra.properties");
	FileInputStream fis=new FileInputStream(file);
	properties.load(fis);
	 
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
	
           public String  geturl() {
        	  String Url = properties.getProperty("url");   
        	  return Url;
}
	
           public String getbrowser() {
        	   String Bro = properties.getProperty("Browser"); 
        	   return Bro;
        	   
}
           
}
