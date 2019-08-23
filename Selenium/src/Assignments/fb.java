package Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Map<String, Object> prefs = new HashMap<String, Object>();

		// add key and value to map as follow to switch off browser notification
		// Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs
		options.setExperimentalOption("prefs", prefs);

		// Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize
		// chrome driver which will switch off this browser notification on the chrome
		// browser
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9154132181");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mybuddi4g");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		Thread.sleep(4000);
		// Alert alert = driver.switchTo().alert();

		driver.findElement(By.xpath("//*[@class='_3en1 _480e navigationFocus _23pl\']")).sendKeys("Hello Gud Evening");

		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();

	}

}
