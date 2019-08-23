package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT"));
		ele.click();
		ele.sendKeys("hyd");
		ele.sendKeys(Keys.RETURN);
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]"));
		ele2.click();
		ele2.sendKeys("ixz");
		ele2.sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/label")).click();
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[7]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
