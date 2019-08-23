package multipleWindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.voot.com/movie/go-goa-gone/379603");
		driver.findElement(By.xpath("//*[@id=\"voot-app\"]/div/div/div/div[2]/div/div/div[1]/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"interfacecontainer\"]/a[1]/div")).click();
	
		Set<String> jingidi=driver.getWindowHandles();
		Iterator<String> dingidi = jingidi.iterator();
		
		String parentWindowID = dingidi.next();
		System.out.println(parentWindowID);
		
		String childWindowID = dingidi.next();
		System.out.println(childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		Thread.sleep(100000);
		driver.close();
	}

}
