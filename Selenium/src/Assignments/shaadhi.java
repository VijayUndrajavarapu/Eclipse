package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shaadhi {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shaadi.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[1]/div[1]/div[2]/a[1]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Sign Up Free')]")).click();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("krishnabelagam1@gmail.com");
	driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("Sai@661992");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='Dropdown-placeholder']")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Brother')]")).click();
	driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/button")).click();
	//driver.findElement(By.xpath("")).sendKeys("");
	//driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sachin");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("tendulkar");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[contains(text(),'Day')]")).click();
    driver.findElement(By.xpath("//div[contains(text(),'06')]")).click();
    driver.findElement(By.xpath("//div[@class='Dropdown-control month_selector']")).click();
    driver.findElement(By.xpath("//div[contains(text(),'Jun')]")).click();
    driver.findElement(By.xpath("//div[@class='Dropdown-control year_selector']")).click();
    driver.findElement(By.xpath("//div[contains(text(),'1992')]")).click();
    driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[4]/div/div/div/div[1]")).click();
    driver.findElement(By.xpath("//div[contains(text(),'Hindu')]")).click();
    driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[5]/div/div/div/div[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[5]/div/div/div[2]/div[1]/div[16]")).click();
    driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[7]/button")).click();	    
    WebElement ele =driver.findElement(By.xpath("//input[@id='places']"));
    ele.sendKeys("Visakhapatnam");
    Thread.sleep(2000);
    ele.sendKeys(Keys.RETURN);
    driver.findElement(By.xpath("//*[@id=\"livesWithFamilyOption\"]/label[1]/div/div[2]")).click();
    WebElement ele1 =driver.findElement(By.xpath("//input[@id='maritalStatus']"));
    ele1.sendKeys("Never Married");
    Thread.sleep(2000);
    ele1.sendKeys(Keys.RETURN);
    WebElement ele2 =driver.findElement(By.xpath("//input[@id='height']"));
    //ele2.sendKeys("Goud");
    Thread.sleep(2000);
    ele2.sendKeys(Keys.RETURN);
    WebElement ele3 =driver.findElement(By.xpath("//input[@id='caste']"));
    ele3.sendKeys("Goud");
    Thread.sleep(2000);
    ele3.sendKeys(Keys.RETURN);
    driver.findElement(By.xpath("//button[@id='submit-form-basic']")).click();
	}
}
