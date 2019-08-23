package DynamicElementWithDynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicElementWithDynamicXpath {

	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("9154132181");
		driver.findElement(By.xpath("//input[@type='password' and @name='pass']")).sendKeys("mybuddi3g");
		driver.findElement(By.id("pass")).submit();
		/*driver.get("https://news.google.com/?hl=en-IN&gl=IN&ceid=IN:en");
		System.out.println("doooooooooooooooooooooo");
		Actions act =  new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyUp(Keys.PAGE_UP).build().perform();*/
	}

}
