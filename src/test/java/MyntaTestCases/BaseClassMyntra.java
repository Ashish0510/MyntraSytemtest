package MyntaTestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadPropertyFile;

public class BaseClassMyntra {
	public static WebDriver driver;
	public static Logger logger;

	@BeforeSuite
	public void LaunchTheBrowser() throws AWTException, InterruptedException {
		ReadPropertyFile rd = new ReadPropertyFile();
		String Url = rd.geturl();
		String Bro = rd.getbrowser().toLowerCase();

		switch (Bro) {
		case "chrome":
			
			 ChromeOptions ops = new ChromeOptions();
			  ops.addArguments("--disable-notifications");
			 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(ops);
			break;
		}

		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger=LogManager.getLogger(BaseClassMyntra.class.getName());

	}

	@AfterSuite(enabled = false)
	public void CloseBrowser() {

		driver.close();
		driver.quit();
	}
}
