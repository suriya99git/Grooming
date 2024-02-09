package Cars;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCase3 {

	@Test(groups = "smoke")
	public void kia() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.kia.com/in/our-vehicles/sonet/showroom.html?utm_source=search&utm_medium=cpc&utm_campaign=sonet_pe&utm_content=text_ad");
		
	}
	
	
}
