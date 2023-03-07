package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import MyntaTestCases.BaseClassMyntra;

public class Screenshot extends BaseClassMyntra {

	public void ScreenshotProvider() throws IOException {
		 Date date = new Date();  
		    
		    String dateFormatString=date.toString().replace(" ","_").replace(":","_");
	TakesScreenshot sc=(TakesScreenshot) driver;
	File source =sc.getScreenshotAs(OutputType.FILE);
	File Destination=new File("./Screenshots/"+dateFormatString+".png");
	FileUtils.copyFile(source,Destination);
	}
	
}
