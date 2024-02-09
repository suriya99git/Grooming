package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertnotequal {

	@Test
	public void testCase() {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		 String BeforeRegister = driver.findElement(By.linkText("Register")).getText();
		 
		 driver.findElement(By.linkText("Register")).click();
		 
		 driver.findElement(By.id("gender-male")).click();
		 
		 driver.findElement(By.id("FirstName")).sendKeys("suriya");
		 
		 driver.findElement(By.id("LastName")).sendKeys("john");
		 
		 driver.findElement(By.id("Email")).sendKeys("abcdzxy@gmail.com");
		 
		 driver.findElement(By.id("Password")).sendKeys("123456");
		 
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		 
		 driver.findElement(By.id("register-button")).click();
		 
		 String Afterregister = driver.findElement(By.xpath("//a[text()='abcdzxy@gmail.com']")).getText();
		 
		 Assert.assertNotEquals(BeforeRegister,Afterregister);
	}
}
