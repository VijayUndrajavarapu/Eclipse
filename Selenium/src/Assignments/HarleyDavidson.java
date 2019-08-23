package Assignments;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HarleyDavidson {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement w = driver.findElement(By.name("q"));
		w.sendKeys("harley davidson");
		w.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[3]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"gigya-login-form\"]/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"gigya-register-form\"]/div[1]/label[1]/p[2]/b[6]")).click();
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		driver.findElement(By.xpath("//*[@id=\"gigya-register-form\"]/div[1]/a[1]")).click();
		Thread.sleep(3000);
		WebElement q=driver.findElement(By.xpath("//*[@id=\"gigya-loginID-129509629346456690\"]"));
		q.clear();
		
		driver.manage().window().maximize();
		
		Properties ulfa = new Properties();
		try {
			java.io.InputStream input = new FileInputStream("\\Users\\chinn\\eclipse-workspace\\Selenium\\src\\Assignments\\config.properties");
			ulfa.load(input);
			String z=(ulfa.getProperty("user"));
			String encrypt= z;
			byte[] decoded = Base64.getDecoder().decode(encrypt);
			String qq=(new String(decoded, StandardCharsets.UTF_8));
			q.sendKeys(qq);
			String a=(ulfa.getProperty("pass"));
			String encrypt1= a;
			byte[] decoded1 = Base64.getDecoder().decode(encrypt1);
			String qq1=(new String(decoded1, StandardCharsets.UTF_8));
			WebElement af=driver.findElement(By.name("password"));
			af.clear();
			af.sendKeys(qq1);
			WebElement Asf=driver.findElement(By.name("passwordRetype"));
			Asf.sendKeys(qq1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"register-site-login\"]/div[6]/input")).click();
		
		WebElement AQ=driver.findElement(By.xpath("//*[@id=\"gigya-textbox-95826191732924340\"]"));
		AQ.sendKeys(ulfa.getProperty("firstname"));
		WebElement AQW =  driver.findElement(By.xpath("//*[@id=\"gigya-textbox-62959148353164700\"]"));
		AQW.sendKeys(ulfa.getProperty("middle"));
		WebElement AQWS= driver.findElement(By.xpath("//*[@id=\"gigya-textbox-76108967639019460\"]"));
		AQWS.sendKeys(ulfa.getProperty("lastname"));
		WebElement ASZ = driver.findElement(By.name("data.address.mailingCountry"));
		ASZ.sendKeys(ulfa.getProperty("country"));
		WebElement ASZX = driver.findElement(By.name("profile.birthMonth"));
		ASZX.sendKeys(ulfa.getProperty("month"));
		WebElement ASZX1 = driver.findElement(By.name("profile.birthDay"));
		ASZX1.sendKeys(ulfa.getProperty("day"));
		WebElement ASZX2 = driver.findElement(By.name("profile.birthYear"));
		ASZX2.sendKeys(ulfa.getProperty("year"));
		WebElement A2 = driver.findElement(By.name("profile.gender"));
		A2.sendKeys(ulfa.getProperty("gender"));
		
		driver.findElement(By.xpath("//*[@id=\"gigya-profile-form\"]/div[3]/label/button")).click();
		driver.findElement(By.xpath("//*[@id=\"gigya-profile-form\"]/div[1]/div[1]/div[1]/label")).click();
		WebElement yes =driver.findElement(By.xpath("//*[@id=\"gigya-dropdown-73790459755856480\"]"));
		yes.click();
		yes.sendKeys("y");
		yes.sendKeys(Keys.ENTER);
		WebElement no =driver.findElement(By.xpath("//*[@id=\"gigya-dropdown-45772208634378480\"]"));
		no.click();
		no.sendKeys("n");
		no.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"gigya-checkbox-subscribe\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"gigya-profile-form\"]/div[3]/div[1]/font/font/input")).click();
		
	}

}
