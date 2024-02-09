package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriverTesting {

	@DataProvider(name = "exceldata")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		
		FileInputStream f = new FileInputStream("excell data//data.xlsx");
		Workbook w = WorkbookFactory.create(f);
		Sheet s = w.getSheet("sheet1");
		int rowsize = s.getPhysicalNumberOfRows();
		int coloumsize = s.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] d = new Object[rowsize-1][coloumsize];
		
		for (int i = 0; i < rowsize-1; i++) {
			
			for (int j = 0; j < coloumsize; j++) {
				
				d[i][j] = s.getRow(i+1).getCell(j).toString();
			}
		}
		
		
		return d;
	}
	
	@Test(dataProvider ="exceldata" )
	public void m1(String user,String passw) {
		System.out.println(user);
		System.out.println(passw);
	}
}

