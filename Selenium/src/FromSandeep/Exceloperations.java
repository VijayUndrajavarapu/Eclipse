package FromSandeep;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;

	public class Exceloperations {
		public static  String datafield; 
		public static  String datavalue;
		public static  String action;
		public static void readdata() throws IOException, InterruptedException
		{

			// TODO Auto-generated method stub
			File f=new File("D:\\Testdata\\gmail.xlsx");
			FileInputStream fin= new FileInputStream(f);
			XSSFWorkbook w=new XSSFWorkbook(fin);
			XSSFSheet sheet=w.getSheetAt(0);
			int r=sheet.getLastRowNum();
			for(int i=1;i<=r;i++)
			{
				XSSFRow row=sheet.getRow(i);
				if(row!=null)
				{
					if(row.getCell(3)!=null)
					{
					datafield=row.getCell(3).getStringCellValue();
					System.out.println(datafield);
					}
					if(row.getCell(4)!=null)
					{
					datavalue=row.getCell(4).getStringCellValue();
					System.out.println(datavalue);
					}
					if(row.getCell(5)!=null)
					{
					action=row.getCell(5).getStringCellValue();
					System.out.println(action);
					}
					Actions.functions(datafield, datavalue, action);
				}
				
			}
		
		}
		
		public static void main(String[] args) throws IOException, InterruptedException {
			readdata();
		}

	}


