package FromSandeep;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {
	
	String Path="E:\\kwdriven.xls";
	FileInputStream fin;
	FileOutputStream fos;
	Workbook wb;
	Sheet sh;
	Row row;
	Cell cell;
	
	public void exceloperations() throws EncryptedDocumentException, InvalidFormatException, IOException{
		fin=new FileInputStream(Path);
		wb=WorkbookFactory.create(fin);
		sh=wb.getSheetAt(0);
		int rowcount=sh.getLastRowNum();
		System.out.println(rowcount);
		for(int i=1; i<=rowcount; i++)
		{
		row=sh.getRow(i);
		if(row.getCell(0).getCellType()==Cell.CELL_TYPE_STRING)
		{
		String a=row.getCell(0).getStringCellValue();
		System.out.println(a);
		}else{
			
			int b=(int) row.getCell(0).getNumericCellValue();
			System.out.println("numeric value: "+b);
		}
		row=sh.createRow(i);
		cell=row.createCell(6);
				cell.setCellValue("1234");
				
		}
		fos=new FileOutputStream("E:\\kwdriven1.xls");
		wb.write(fos);
		fos.flush();
		fos.close();
				
		
	}

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		ExcelUtils ex=new ExcelUtils();
		ex.exceloperations();
	}

}
