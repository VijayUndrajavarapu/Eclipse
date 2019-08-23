package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZoominZoomOut {
	WebDriver driver = new ChromeDriver();

	@Test
	public void zoomInZoomOutInSelenium() throws InterruptedException {
		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver", "/Users/bsingh5/Documents/coreJava/selenium/drivers/chromedriver.exe");
				
		
		
		driver.get("http://automationpractice.com/index.php");
		// zoom out by 40%
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='40%'");
		
		Thread.sleep(3000);
		// zoom out by 100%
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");
		
	}
	@Test
	public void m1() {
		
	
	driver.get("https://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	// click on What’s NetBanking all about?
	driver.findElement(By.xpath("//*[@id='accordian1']/h3")).click();
	// when we click class name will have active appended
	String className = driver.findElement(By.xpath("//*[@id='accordian1']/h3")).getAttribute("class");
    System.out.println(className);
    
    if(className.contains("clearfix open active")){
    	   Assert.assertTrue(true, "Test verifyRadioButton is PASS");
    }
    else{
    	 Assert.assertTrue(false, "Test verifyRadioButton is PASS");
    }
	}
}
