package Bikes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCase6 {

	@Test(groups = "smoke")
	public void ducati() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ducati.com/in/en/home");
	}
}
