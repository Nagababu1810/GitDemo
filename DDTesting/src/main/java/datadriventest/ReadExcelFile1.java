package datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("E:\\TestData1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++) {
			
			XSSFRow rowvalue = sheet.getRow(i);
			
			for(int j=0;j<colcount;j++) {
				
				
				String valu = rowvalue.getCell(j).toString();
				System.out.print("  "+valu);
			}
			System.out.println();
		}
		
		

	}

}
