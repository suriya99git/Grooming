package Selenium_Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment {

	ChromeDriver driver;
	@Test()
	public void register() {
		driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/register");

		driver.findElement(By.linkText("Register")).click();

		WebElement gender = driver.findElement(By.id("gender-male"));

		gender.click();

		WebElement firstname = driver.findElement(By.id("FirstName"));

		firstname.sendKeys("Suriya");

		WebElement lastname = driver.findElement(By.id("LastName"));

		lastname.sendKeys("Johnson");

		WebElement email = driver.findElement(By.id("Email"));

		email.sendKeys("suriyaj33@gmail.com");

		WebElement password = driver.findElement(By.id("Password"));

		password.sendKeys("123456");

		WebElement confpass = driver.findElement(By.id("ConfirmPassword"));

		confpass.sendKeys("123456");

		WebElement regbutton = driver.findElement(By.id("register-button"));

		regbutton.click();
		
	    driver.findElement(By.linkText("suriyaj33@gmail.com")).isDisplayed();
		
	    
		
	}
	@Test(dependsOnMethods = "register",priority = 2)
	public void login() throws InterruptedException {

		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("suriyaj33@gmail.com");
		Thread.sleep(1000);
		WebElement confpass = driver.findElement(By.id("Password"));
		Thread.sleep(1000);
		confpass.sendKeys("123456");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.linkText("Log out")).isDisplayed();
	}
	
	@Test(priority = 1)
	public void logout() {

		driver.findElement(By.linkText("Log out")).click();
	}
	
	

}
