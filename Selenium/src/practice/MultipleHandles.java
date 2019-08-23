package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleHandles {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/blog/handle-multiple-windows-in-selenium/#What_is_Selenium_Webdriver?");
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[3]/div[5]/p[6]/span[2]/em/strong/a")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		ArrayList<String> Tabs = new ArrayList<>(allwindows);
		
		driver.switchTo().window(Tabs.get(1));
		driver.close();
		
		driver.switchTo().window(Tabs.get(0));
		driver.close();
		
		System.out.println("title is "+ driver.getTitle());
		
	}

}
