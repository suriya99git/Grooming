package Cars;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCase2 {

	
	@Test
	public void audi() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.audi.in/in/web/en.html");
	}
	
}
