package practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demodatadriven {

	public static void main(String[] args) throws Exception  {
		File F = new File("C:\\Users\\chinn\\Downloads\\practicingExcel.xlsx");
		FileInputStream in = new FileInputStream(F);
		XSSFWorkbook wb = new XSSFWorkbook(in);    
		XSSFSheet sheet1= wb.getSheetAt(0);
		String data = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
		
		
		
		
		
		
		
	}
}
