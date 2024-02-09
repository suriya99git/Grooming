package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("excell data//data.xlsx");

		Workbook w = WorkbookFactory.create(fis);

		Sheet s = w.getSheet("sheet1");

		int rowsize = s.getPhysicalNumberOfRows();
		int coloumsize = s.getRow(0).getPhysicalNumberOfCells();

		Object data[][] = new Object[rowsize][coloumsize];

		for (int i = 0; i < rowsize; i++) {

			for (int j = 0; j < coloumsize; j++) {

				data[i][j] = w.getSheet("sheet1").getRow(i).getCell(j).toString();

				// System.out.println(data);
			}
		}

		for (int i = 0; i < rowsize; i++) {

			for (int j = 0; j < coloumsize; j++) {

				// data[i][j] = w.getSheet("sheet1").getRow(i).getCell(j).toString();

				System.out.println(data[i][j]);
			}
		}



	}
}
