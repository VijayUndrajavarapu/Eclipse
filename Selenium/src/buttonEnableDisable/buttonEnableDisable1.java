package buttonEnableDisable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonEnableDisable1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement l=driver.findElement(By.name("sex"));
		l.click();
		
		boolean ParticularButton = l.isEnabled();
		if(ParticularButton)
			System.out.println("enabled");
		else
			System.out.println("disabled");

	}

}
