package org.web.automation.Base;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.web.automation.library.PropertyReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitiateBrowser {
	
	public WebDriver driver;
	
	
	@Before
	public void startBrowser() throws IOException{
		
		if(PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("chrome")) {
			driver = WebDriverManager.chromedriver().create();
		}
		else if (PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("firefox")) {
			driver = WebDriverManager.firefoxdriver().create();
		}
		else if(PropertyReader.applicationConfigReader("BrowserName").equalsIgnoreCase("edge")) {
			driver = WebDriverManager.edgedriver().create();
		}

		driver.manage().window().maximize();
		driver.get(PropertyReader.applicationConfigReader("Application_URL"));
	}
	
@After
	public void closeBrowser() {
		driver.quit();
	}
	

}
