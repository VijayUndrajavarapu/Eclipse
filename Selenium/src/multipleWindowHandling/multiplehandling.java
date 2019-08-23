package multipleWindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplehandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.voot.com/movie/go-goa-gone/379603");
		driver.findElement(By.xpath("//*[@id=\"voot-app\"]/div/div/div/div[2]/div/div/div[1]/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"interfacecontainer\"]/a[2]/div/span[2]")).click();
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		
		String parentWindowID = it.next();
		System.out.println(parentWindowID);
		
		String childWindowID = it.next();
		System.out.println(childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
 		

	}

}
