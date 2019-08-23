package FromSandeep;


import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtlities {

	//String filePath=System.getProperty("user.dir")+"\\TestInputs\\testdata.xls";
	//String in_filePath;
	//String out_filePath;
	Workbook workbook;
	//Sheet sheet;
	//Row row;
	Cell cell;
	
	public void getExcelsheet(String path) throws Exception{
		
		FileInputStream inputstream=new FileInputStream(path);
		workbook=WorkbookFactory.create(inputstream);
	}
	
	public int getRows(String sheetName){
		
		return workbook.getSheet(sheetName).getLastRowNum();
	}
	
	public int getCells(String sheetName, int Row){
		
		return workbook.getSheet(sheetName).getRow(Row).getLastCellNum();
	}
	
	public String getData(String sheetName, int row, int column){
		
		String data=null;
		
		if(workbook.getSheet(sheetName).getRow(row).getCell(column).getCellType()==cell.CELL_TYPE_STRING){
			data=workbook.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		}else{
			int numericData=(int)workbook.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
			data=String.valueOf(numericData);
		}
		return data;
	}
	
	public void setDataToExcel(String resultTemplatePath, String resultSheet, int row, int column, String cellData, String outputfilePath) throws Exception{
		FileInputStream fin=new FileInputStream(resultTemplatePath);
		
		workbook.getSheet(resultSheet).createRow(row).getCell(column).setCellValue(cellData);
		FileOutputStream outputstream= new FileOutputStream(outputfilePath);
		workbook.write(outputstream);
		outputstream.flush();
		outputstream.close();
	}
	
}

