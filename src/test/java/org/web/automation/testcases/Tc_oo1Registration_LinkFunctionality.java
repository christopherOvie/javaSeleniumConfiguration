package org.web.automation.testcases;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.web.automation.Base.InitiateBrowser;
import org.web.automation.library.PropertyReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_oo1Registration_LinkFunctionality extends InitiateBrowser{
	
	//WebDriver driver;


     @Test
	public void tc001() throws InterruptedException, IOException {
		//driver.findElement(By.xpath("//label[text()='Login']")).click();
		driver.findElement(By.name("fld_username")).sendKeys(PropertyReader.applicationConfigReader("Application_Username"));
		Thread.sleep(5000);
		
		driver.findElement(By.name("fld_password")).sendKeys(PropertyReader.applicationConfigReader("Application_Password"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Read Detail']")).click();
	
		
	}
}
