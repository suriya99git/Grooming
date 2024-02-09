
package CrossBrowserTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase extends BaseClass {

	@Test
	public void testCase() {
		
         driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("suriya456@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
}
