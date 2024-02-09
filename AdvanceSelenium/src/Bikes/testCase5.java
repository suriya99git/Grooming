package Bikes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCase5 {

	@Test
	public void pulsar() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bajajauto.com/bikes/pulsar");
	}
}
