package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.testng.annotations.Test;

public class ReadExcelFile {

	@Test(enabled=false)
	public void GetcellValue() throws IOException {
		File file = new File("./TestData/ExcelFile.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");

		int ttlrow = sheet.getLastRowNum() ;
		System.out.println("the no.of rows" + ttlrow);

		int ttlcolumn = sheet.getRow(0).getLastCellNum();
		System.out.println("the no.of column" + ttlcolumn);
		DataFormatter formatter=new DataFormatter();
		
		String[][] data=new String[ttlrow][ttlcolumn]; 
		for(int i=1;i<=ttlrow;i++) {
			
			for (int j=0;j<ttlcolumn;j++) {
				data[i-1][j]=formatter.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(data);
			}
		}

	}

}
