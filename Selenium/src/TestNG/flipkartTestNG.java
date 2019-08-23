package TestNG;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class flipkartTestNG {
	ChromeDriver driver = new ChromeDriver();

	@BeforeMethod
	public void WebPage() {
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	@Parameters({"user","pass"})
	public void logIn(String user,String pass)  {
		String encrypt= "user,pass";
		byte[] decoded = Base64.getDecoder().decode(encrypt);
		System.out.println(new String(decoded, StandardCharsets.UTF_8));
		System.out.println("first test case");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys(user);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).submit();
	}
	@Test(priority =2)
	public void searching() {
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("iphone 7 plus");
		ele.sendKeys(Keys.ENTER);
		System.out.println("second test case");
	}
	@Test
	public void scroll() {
		System.out.println("third test case");
		driver.getCurrentUrl();
		String expectedUrl="https://www.flipkart.com/";
		Assert.assertEquals(expectedUrl,  driver.getCurrentUrl());
		Actions act = new Actions(driver);
		WebElement asdf = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
		act.moveToElement(asdf);
	}
	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(8000);
		
	}
}
	