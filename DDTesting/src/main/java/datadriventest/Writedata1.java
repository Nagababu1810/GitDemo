package datadriventest;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata1 {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file= new FileOutputStream("E:\\TestData2.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data1");
		
		XSSFRow row1 = sheet.createRow(0);
		
		row1.createCell(0).setCellValue("usesrname");
		row1.createCell(1).setCellValue("password");

		
		XSSFRow row2 = sheet.createRow(1);
		
		row2.createCell(0).setCellValue("nagbabu");
		row2.createCell(1).setCellValue("p1");
		
		
		XSSFRow row3 = sheet.createRow(2);
		
		row3.createCell(0).setCellValue("raju");
		row3.createCell(1).setCellValue("p2");
		
		workbook.write(file);
		
		System.out.println("write the program");
	}

}
