package DynamicWebTable;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DwTable {

		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/web-table-element.php");
			
			List<WebElement> frog = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
			int x=frog.size();
			System.out.println(x);
			System.out.println("|||||||||||||||");
			
			//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
			String firstxpath = "//*[@id='leftcontainer']/table/tbody/tr[";
			String secxpath = "]/td[1]/a";
			for(int i=1;i<=x;i++) {
				String katraj = firstxpath+i+secxpath;
				WebElement w=driver.findElement(By.xpath(katraj));
				System.out.println(w.getText());
			}
			driver.close();
			
		}

	}
