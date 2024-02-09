package Selenium_Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Depends {


	@Test
	public void login() {


		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}
	@Test
	public void register() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.linkText("Registersdfgh")).click();
	}
	
	@Test
	public void logut() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://twitter.com/?lang=en-in");
	}
}
