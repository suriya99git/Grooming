package TestngListner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerImplementation.class)
public class TestCase {

	@Test
	public void testCase() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("suriya456@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	
}
