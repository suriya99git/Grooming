package FetchingDataExcel;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excell {

//	public static void main(String[] args) throws IOException {
//		
//		FileInputStream fis = new FileInputStream("excell data//data.xlsx");
//		
//		Workbook xlsx = WorkbookFactory.create(fis);
		
//	      String data =  xlsx.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
//	      String data1 =  xlsx.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
//	      String data2 =  xlsx.getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
//	      
//	      
//	      System.out.println(data);
//	      System.out.println(data1);
//	      System.out.println(data2);
//	      
		
//		int row = xlsx.getSheet("sheet1").getPhysicalNumberOfRows();
//		 int coloum= xlsx.getSheet("sheet1").getRow(0).getPhysicalNumberOfCells();
//		String data[][]=new String[row-1][coloum];
//	      for(int i=0;i<row-1;i++) {
//	    	  for(int j=0;j<coloum;j++) {
//	    		  data[i][j] =  xlsx.getSheet("sheet1").getRow(i+1).getCell(j).getStringCellValue();
//		    	  System.out.println(data[i][j]);  
//	    	 
//	}
//	    	  }	 
		
	//	}
	
	@Test(dataProvider = "loginData")
	public void test(String username,String password) {
		
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider(name = "loginData")
	public Object[][] data1(){
		
		Object[][]data = new Object[2][2];
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[1][0] = "username2";
		data[1][1] = "password2";
		
		return data;
	}
}

