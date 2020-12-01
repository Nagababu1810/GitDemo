package datadriventest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream file=new FileOutputStream("E:\\TestData3.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Logindata1");
		XSSFSheet sheet1=workbook.createSheet("Logindata2");
		
		for(int i=0;i<5;i++) {
			
			XSSFRow no_rows = sheet.createRow(i);
			XSSFRow no_rows1 = sheet.createRow(i);
			for(int j=0;j<3;j++) {
				
				 no_rows.createCell(j).setCellValue("xyz");
				 no_rows1.createCell(j).setCellValue("abc");
			}
		}
		
		workbook.write(file);
		//workbook.write1(file);
		file.close();

			System.out.println("write the excel sheet");

	}
}