package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestNG2 {
	public static void main(String[] args) throws Exception {
		
	File src = new File("C:\\Users\\Dell\\Documents\\practicingExcel.xlsx");
	FileInputStream fin = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fin);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String data0 = sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println("Data from excel is " + data0);
	String data1 = sheet1.getRow(0).getCell(4).getStringCellValue();
	System.out.println("Data from excel is " + data1);
	String data2 = sheet1.getRow(0).getCell(7).getStringCellValue();
	System.out.println("Email of Abc company : " + data2);
    
	
	}
}
