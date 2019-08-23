package DynamicWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWTpractice1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> RowsList= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int rows = RowsList.size();
		System.out.println(rows);
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
		String Fxpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
		String Sxpath = "]/td[1]";
		/*for(int i=1;i<=rows;i++) {
			String total = Fxpath+i+Sxpath;
			WebElement w=driver.findElement(By.xpath(total));
			System.out.println(w.getText());
		}
		System.out.println("*************************");*/
		WebElement wed = driver.findElement(By.xpath("//a[contains(text(),'Corporation Bank')]"));
		System.out.println(wed.getText());
	}

}
