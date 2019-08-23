package practice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://tutorialehtml.com/en/html-tutorial-radio-buttons");
		List<WebElement> z = driver.findElements(By.name("sex"));
		System.out.println(z.size());
		z.get(1).click();
		System.out.println(z.get(0).getAttribute("selected"));
		System.out.println(z.get(1).getAttribute("selected"));
		driver.quit();
	}

}
