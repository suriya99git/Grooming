package Selenium_Batch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class program {

	@Test(priority = 2,invocationCount = 2,threadPoolSize = 2)
	public void login() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}
	@Test(priority = 3)
	public void register() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
	}
	@Test(priority = 1)
	public void logut() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://twitter.com/?lang=en-in");
	}


}
