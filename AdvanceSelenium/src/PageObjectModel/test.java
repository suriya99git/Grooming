package PageObjectModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {

	@Test(dataProvider = "data")
	public void testCase(String fn,String ln,String em,String ps) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WelcomePage w = new WelcomePage(driver);
		
		w.getRegisterlink().click();
		
		RegisterPage r = new RegisterPage(driver);
		
		r.getGender().click();
		
		r.getFirstname().sendKeys(fn);
		
		r.getLastname().sendKeys(ln);
		
		r.getEmailid().sendKeys(em);
		
		r.getPassword().sendKeys(ps);
		
		r.getConfirmpassword().sendKeys(ps);
		
		r.getRegisterbutton().click();
		
		w.getLogoutlink().click();
		
		LoginPage l = new LoginPage(driver);
		
		l.getLogin().click();
		
		l.getEmailid().sendKeys(em);
		
		l.getPassword().sendKeys(ps);
		
		l.getLoginbutton().click();
		
		
	}
	
	@DataProvider(name="data")
	public Object[][] testData() throws EncryptedDocumentException, IOException {
		
		FileInputStream f = new FileInputStream("data2//data3.xlsx");
		Workbook w = WorkbookFactory.create(f);
		Sheet s = w.getSheet("sheet1");
		int row = s.getPhysicalNumberOfRows();
		 int coloumn = s.getRow(0).getPhysicalNumberOfCells();
		 
		 Object[][] d = new Object[row][coloumn];
		 
		 for (int i = 0; i < row; i++) {
			
			 for (int j = 0; j < coloumn; j++) {
				
				 d[i][j] = s.getRow(i).getCell(j).toString();
				 
			}
		}
		 
		 return d;
	}
	
}
