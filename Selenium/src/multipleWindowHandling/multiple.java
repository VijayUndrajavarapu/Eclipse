package multipleWindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.findElement(By.xpath("https://accounts.google.com/signout/chrome/landing?continue=https://mail.google.com/mail&oc=https://mail.google.com/mail&hl=en"));
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a")).click();
		
		Set<String>st=driver.getWindowHandles();
		Iterator<String>it = st.iterator();
		
		String parentWindowId = it.next();
		System.out.println(parentWindowId);
		
		String childWindowId = it.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
