package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertnull {

	@Test
	public void testCase() {
		
		//ChromeDriver driver = null;
		
		Assert.assertNull(10)
		;
	}
}
