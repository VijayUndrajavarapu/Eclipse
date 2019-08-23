package buttonEnableDisable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonEDoriginal {
	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			WebElement l=driver.findElement(By.name("sex"));
			l.click();

		boolean particularbutton = l.isEnabled();
		if(particularbutton) {
			System.out.println("Enabled");
		}else {
			System.out.println("disabled");
		}
		
		
	}
}
