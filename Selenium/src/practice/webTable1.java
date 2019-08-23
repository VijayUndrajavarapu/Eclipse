package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> l = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		int totalRows = l.size();
		System.out.println(totalRows+"******************");
		
		List<WebElement> kol=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int totalcols = kol.size();
		System.out.println(totalcols);
		System.out.println("|||||||||||||||||||||||||||");
		WebElement QE=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[13]/td[4]"));
		System.out.println(QE.getText());
		System.out.println("|||||||||||||||||||||||||||");
		
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
		String firsxpath = "//*[@id='leftcontainer']/table/tbody/tr[";
		String secoxpath = "]/td[1]/a";
		for(int i=1;i<=totalRows;i++) {
			String Total = firsxpath+i+secoxpath;
			WebElement We=driver.findElement(By.xpath(Total));
			System.out.println( We.getText());
		}
			System.out.println("*****************************");
			
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[3]
		String one="//*[@id='leftcontainer']/table/tbody/tr[";
		String two="]/td[3]";
		for(int j=1;j<=totalRows;j++) {
			String finalxpath = one+j+two;
			WebElement S=driver.findElement(By.xpath(finalxpath));
			System.out.println(S.getText());
		}
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[5]/font
		String zeroxpath = "//*[@id='leftcontainer']/table/tbody/tr[";
		String onexpath = "]/td[5]/font";
		for(int q=1;q<=totalRows;q++) {
			String jingidi=zeroxpath+q+onexpath;
			WebElement qaz=driver.findElement(By.xpath(jingidi));
			System.out.println(qaz.getText());
		}
		System.out.println("|||||||||||||||||||||||||");
		driver.close();
	}
}
