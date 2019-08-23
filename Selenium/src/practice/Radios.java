package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radios {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		driver.get("https://tutorialehtml.com/en/html-tutorial-radio-buttons");
		driver.manage().window().maximize();
		List<WebElement> k =driver.findElements(By.name("citizenship"));
		System.out.println("Total no. of radio buttons are"+ k.size());
		k.get(2).click();
		System.out.println(k.get(0).getAttribute("selected"));
		System.out.println(k.get(1).getAttribute("selected"));
		System.out.println(k.get(2).getAttribute("selected"));
		driver.close();	
	}

}
