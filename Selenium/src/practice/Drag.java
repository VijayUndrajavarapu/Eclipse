package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		WebElement w = driver.findElement(By.id("draggable"));
		Actions a =new Actions(driver);
		a.dragAndDropBy(w, 200, 200).build().perform();
		driver.close();

	}

}
