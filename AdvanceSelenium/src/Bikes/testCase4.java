package Bikes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCase4 {

	
	@Test(dependsOnGroups = "smoke")
	public void pulsar() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bajajauto.com/bikes/pulsar");
	}
	
	
}
