package DynamicWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWTpractice2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		WebElement w=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[1]/a"));
		System.out.println(w.getText());
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr"));
		int o= list.size();
		System.out.println(o);
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
		String qxpath = "//*[@id=\'leftcontainer\']/table/tbody/tr[";
		String wxpath = "]/td[1]/a";
		for(int i=1;i<=o;i++) {
			String total= qxpath+i+wxpath;
			WebElement R = driver.findElement(By.xpath(total));
			System.out.println(R.getText());
		}
		
	}

}
