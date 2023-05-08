package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TC_2 {
	
	@Before
	public void startBrowser() {
		System.out.println("starting browser + put code");
	}

	@After
	public void closeBrowser() {
		
	}
	
	@Test
	public void tc001() {
		System.out.println("TC_001");
	}
}
