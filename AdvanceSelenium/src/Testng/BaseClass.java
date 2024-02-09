package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	ChromeDriver driver;
	@BeforeSuite
	public void connectServer() {
		Reporter.log("connecting to the server",true);
	}
	
	@BeforeTest
	public void connectDatabase() {
		Reporter.log("connecting to the database",true);
	}
	
	@BeforeClass
	public void connectServer1() {
		Reporter.log("Opening the Browser",true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("suriya456@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void disconnectServer1() {
		Reporter.log("closing the Browser",true);
		driver.quit();
	}
	
	@AfterTest
	public void disconnectDatabase() {
		Reporter.log("disconnecting to the database",true);
	}
	
	@AfterSuite
	public void disconnectServer() {
		Reporter.log("disconnecting to the server",true);
	}
}
