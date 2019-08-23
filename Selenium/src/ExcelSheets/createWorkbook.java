package ExcelSheets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createWorkbook {

	public static void main(String[] args) throws Throwable {
		Workbook wb = new HSSFWorkbook();
		org.apache.poi.ss.usermodel.Sheet sheet1 = wb.createSheet("alcoholers");
		CreationHelper createHelper = wb.getCreationHelper();
		Row row = sheet1.createRow(0);
	   
		sheet1.getRow(0).createCell(2).setCellValue("Team");

		
	    org.apache.poi.ss.usermodel.Sheet sheet11 = wb.createSheet("ulfass");
	    CreationHelper createHelper1 = wb.getCreationHelper();
		Row row1 = ((org.apache.poi.ss.usermodel.Sheet) sheet11).createRow(0);
	    

		row.createCell(1).setCellValue(1.2);
	    row.createCell(2).setCellValue(
	         createHelper.createRichTextString("This is a string"));
	    row.createCell(3).setCellValue(true);

		
	    org.apache.poi.ss.usermodel.Sheet sheet111 = wb.createSheet("jaffaass");
	    CreationHelper createHelper11 = wb.getCreationHelper();
		Row row11 = ((org.apache.poi.ss.usermodel.Sheet) sheet111).createRow(0);
	    
		

	    sheet111.getRow(0).createCell(0).setCellValue("v");
	    sheet111.getRow(0).createCell(1).setCellValue("i");
	    sheet111.getRow(0).createCell(2).setCellValue("j");
	    sheet111.getRow(0).createCell(3).setCellValue("a");
	    sheet111.getRow(0).createCell(4).setCellValue("y");
	    sheet111.getRow(0).createCell(5).setCellValue("k");
	    sheet111.getRow(0).createCell(6).setCellValue("u");
	    sheet111.getRow(0).createCell(7).setCellValue("m");
	    sheet111.getRow(0).createCell(8).setCellValue("a");
	    sheet111.getRow(0).createCell(9).setCellValue("r");

	    sheet111.getRow(0).createCell(20).setCellValue("v");
	   
	    
	    /*
	    CellStyle style = wb.createCellStyle();
	    style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
	    style.setFillPattern(FillPatternType.BIG_SPOTS);
	    Cell cell = row.createCell(1);
	    cell.setCellValue("X");
	    cell.setCellStyle(style); */
	    
	    CellStyle style = wb.createCellStyle();
	    style = wb.createCellStyle();
	    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    Cell cell = row.createCell(1);
	    cell.setCellValue("X");
	    cell.setCellStyle(style);
	  
	    int rowcount = sheet111.getLastRowNum();
	    for(int i = 0;i<=rowcount;i++)
	    {
	    	int colcount = sheet111.getRow(i).getLastCellNum();
	    	for(int k =0;k<colcount;k++)
	    		{
	    			Cell c1 = sheet111.getRow(i).getCell(k);
	    			System.out.println("Row:="+ i + ";" + "Column:=" + k + " : "+
	    			c1.getStringCellValue());
	    		}
	    }
	 
	    
	    try (OutputStream fileOut = new FileOutputStream("first practice.xls")) {
	        wb.write(fileOut);
	    }
	    System.out.println("***************************************");
	    
	}
	
}
