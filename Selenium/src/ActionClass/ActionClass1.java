package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/demos/droppable/");
		driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		WebElement w=driver.findElement(By.id("draggable"));
		WebElement z=driver.findElement(By.id("droppable"));
		Actions act =new Actions(driver);
		act.dragAndDrop(w, z).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
	
	}

}
