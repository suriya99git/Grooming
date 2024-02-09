package Cars;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCase1 {

	@Test(groups = "smoke")
	public void lamborghini() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.lamborghini.com/en-en");
		
	}
	
}
