package FromSandeep;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptDemo  
{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail01.valuelabs.com/");
		driver.findElement(By.id("username")).sendKeys("sairam.koppolu@valuelabs.com");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".zLoginField"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".zLoginField"))).sendKeys("sairam.koppolu@valuelabs.com");
		WebElement password= driver.findElement(By.cssSelector("input#password"));
		password.sendKeys("Secure135");
		WebElement loginbutton=driver.findElement(By.cssSelector(".ZLoginButton.DwtButton"));
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginbutton);
		String pageTitle=js.executeScript("return document.title").toString();
		System.out.println(pageTitle);
		js.executeScript("window.scrollBy(0,200)");
		String sText =  js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(sText);
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
