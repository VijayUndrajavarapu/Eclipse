package Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		WebElement w = driver.findElement(By.name("dropdown"));
		
		Select dropd = new Select(w);
		dropd.selectByValue("ddautomation");
		
		System.out.println(w.getText());
		System.out.println("*");
	}

}
