package multipleWindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindowHandling1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/forgotpassword");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/a/span")).click();
		
		Set<String> SS= driver.getWindowHandles();
		Iterator<String> it = SS.iterator();
		
		String parentWindowID = it.next();
		System.out.println(parentWindowID);
		
		String childWindowID = it.next();
		System.out.println(childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
