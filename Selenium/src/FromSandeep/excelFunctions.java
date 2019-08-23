package FromSandeep;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelFunctions {

	FileInputStream fin;
	//String path="";
	Workbook wb;
	Sheet sh;
	Row row;
	Cell cell;
	FileOutputStream fout;
	String outputPath;

	public void fileReader(String path) throws InvalidFormatException, IOException
	{
	fin=new FileInputStream(path);
	wb=WorkbookFactory.create(fin);
	sh=wb.getSheetAt(0);
	}

	public int rowcount(String sheetName){
	return wb.getSheet(sheetName).getLastRowNum();
	}

	public int columncount(String sheetName, int rowNmbr){
	return wb.getSheet(sheetName).getRow(rowNmbr).getLastCellNum();
	}

	public String getData(String sheetName, int rowNmbr, int colNmbr){
	String stringData=null;
	if(wb.getSheet(sheetName).getRow(rowNmbr).getCell(colNmbr).getCellType()==cell.CELL_TYPE_STRING){
	stringData=wb.getSheet(sheetName).getRow(rowNmbr).getCell(colNmbr).getStringCellValue();
	}else{
	int numericData=(int) wb.getSheet(sheetName).getRow(rowNmbr).getCell(colNmbr).getNumericCellValue();
	stringData=String.valueOf(numericData);
	}
	return stringData;
	}

	public void setData(String sheetName, int rowNmbr, int colNmbr, String newData) throws IOException{
	wb.getSheet(sheetName).getRow(rowNmbr).createCell(colNmbr).setCellValue(newData);
	fout=new FileOutputStream(outputPath);
	wb.write(fout);
	fout.close();
	}

	public void CreateRowsetData(String sheetName, int rowNmbr, int colNmbr, String newData) throws IOException{
	wb.getSheet(sheetName).createRow(rowNmbr).createCell(colNmbr).setCellValue(newData);
	fout=new FileOutputStream(outputPath);
	wb.write(fout);
	fout.close();
	}
	
}
