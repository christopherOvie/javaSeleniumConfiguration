package org.web.automation.testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.web.automation.Base.InitiateBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_oo1Registration_LoginFunctionality extends InitiateBrowser{
	

     @Test
	public void tc001() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()='Login']")).click();
		
		driver.findElement(By.name("_txtUserName")).sendKeys("chris");
		driver.findElement(By.name("_txtPassword")).sendKeys("Father70");
		driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();
		
	}
}
