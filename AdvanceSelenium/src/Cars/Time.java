package Cars;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Time {

	
	@Test(timeOut = 10000)
	public void OPen() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
	}
}
