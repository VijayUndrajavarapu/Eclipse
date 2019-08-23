package FromSandeep;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ExcelOperations_POI {

	public static void main(String[] args) {
		File f= new File("D:\\Testdata\\Tdata.xls");
		try {
			FileInputStream fin=new FileInputStream(f);
			HSSFWorkbook w=new HSSFWorkbook(fin);
			HSSFSheet s=w.getSheetAt(0);
			int r=s.getLastRowNum();
			System.out.println(r);
			for(int i=1; i<=r; i++)
			{
				Row row=s.getRow(i);
				String val1=row.getCell(0).getStringCellValue();
				System.out.println(val1);
				int var1=Integer.parseInt(val1);
				String val2=row.getCell(1).getStringCellValue();
				System.out.println(val2);
				int var2=Integer.parseInt(val2);
				int sum=var1+var2;
				String summation=String.valueOf(sum);
				row.createCell(2).setCellValue(summation);
			}
			FileOutputStream fout=new FileOutputStream("D:\\Testdata\\Tdata1.xls");
			w.write(fout);
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
