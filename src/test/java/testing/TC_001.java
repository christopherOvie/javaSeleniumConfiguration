package testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC_001 {
	
	@BeforeClass
	public static  void startBrowser() {
		System.out.println("starting browser + put code");
	}

	@AfterClass
	public static void closeBrowser() {
	System.out.println("close browser");	
	}
	@After
	public void cleanup() {
		System.out.println("clean up");
	}
	@Before
	public void enterUrl() {
		System.out.println("enter url");
	}
	@Test
	public void tc002() {
		System.out.println("TC_001");
	}
	
	@Test
	public void tc001() {
		System.out.println("TC_002");
	}
	@Test
	public void tc003() {
		System.out.println("TC_003");
	}
	
}
