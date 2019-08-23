package FromSandeep;



import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelOperations_JXL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("D:\\Testdata\\Tdata.xls");
			Workbook w= Workbook.getWorkbook(fis);
			Sheet s=w.getSheet("Sheet1");
			int rows=s.getRows();
			int columns=s.getColumns();
			System.out.println("Rows: "+rows+"    "+"Columns: "+columns);
			for(int i=1; i<rows;i++)
			{
				//for(int j=0; j<columns; j++)
				//{
					String val1=s.getC	ell(0, i).getContents();
					int input1=Integer.parseInt(val1);
					System.out.println(input1);
					String val2=s.getCell(1, i).getContents();
					int input2=Integer.parseInt(val2);
					System.out.println(input2);
				//}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
