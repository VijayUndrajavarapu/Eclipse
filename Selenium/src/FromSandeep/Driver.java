package FromSandeep;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Driver {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		// TODO Auto-generated method stub
		ExcelUtlities.readData("C:\\Users\\dell\\Desktop\\inputfile.xlsx", "datafile");
		int rowcount = ExcelUtlities.rowCount("datafile");
		System.out.println(rowcount);
		int createrow = 1;
		for (int i = 1; i <= rowcount; i++) {
			String co1 = ExcelUtlities.getData("datafile", i, 0);
			String co2 = ExcelUtlities.getData("datafile", i, 1);
			String co3 = ExcelUtlities.getData("datafile", i, 2);
			ExcelUtlities.creatRow("C:\\Users\\dell\\Desktop\\outputRef.xlsx", createrow);
			if (!co1.equals(null)) {
				ExcelUtlities.setData("C:\\Users\\dell\\Desktop\\outputRef.xlsx", createrow, 0, co1,
						"C:\\Users\\dell\\Desktop\\outPut.xlsx");
			}
			if (!co2.equals(null)) {
				ExcelUtlities.setData("C:\\Users\\dell\\Desktop\\outputRef.xlsx", createrow, 1, co2,
						"C:\\Users\\dell\\Desktop\\outPut.xlsx");
			}
			if (!co3.equals(null)) {
				ExcelUtlities.setData("C:\\Users\\dell\\Desktop\\outputRef.xlsx", createrow, 2, co3,
						"C:\\Users\\dell\\Desktop\\outPut.xlsx");
			}
			createrow = createrow + 1;
		}
	}

}
