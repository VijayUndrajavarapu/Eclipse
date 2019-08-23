package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://in.rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='emailsubmit']")).click();
		driver.findElement(By.xpath("//input[@id='userpass']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='loginsubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='createPortfolio']")).click();
		driver.findElement(By.xpath("//input[@id='create']")).clear();
		driver.findElement(By.xpath("//input[@id='create']")).sendKeys("pawan");

		driver.findElement(By.xpath("//input[@id='createPortfolioButton']")).click();
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='portfolioid']")));
		sel.selectByVisibleText("pawan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='deletePortfolio']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//input[@id='addStock']")).click();
		driver.findElement(By.xpath("//input[@id='addstockname']")).sendKeys("Tata product");
		// driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("//a[@id='stockPurchaseDate']")).click();
		driver.findElement(By.xpath("//td[4]//button[1]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'15')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='addstockqty']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@id='addstockprice']")).sendKeys("250000");
		driver.findElement(By.xpath("//input[@id='addStockButton']")).click();
		// delete the stock
		driver.findElement(By.xpath("//input[@id='equityid12150008']")).click();
		driver.findElement(By.xpath("//input[@name='Delete']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath("//input[@id='equityid15510001']")).click();
		driver.findElement(By.xpath("//*[@id=\"equityRow19339864\"]/td[3]/div/input[1]")).click();
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='equityaction']")));
		sel1.selectByVisibleText("Buy");
		driver.findElement(By.xpath("//a[@id='buySellCalendar']")).click();
		driver.findElement(By.xpath("//td[4]//button[1]")).click();
		driver.findElement(By.xpath("//div[@id='datepicker']//tr[4]//td[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buysellqty']")).sendKeys("250");
		driver.findElement(By.xpath("//input[@id='buysellprice']")).sendKeys("354015");
		driver.findElement(By.xpath("//input[@id='buySellStockButton']")).click();
		driver.findElement(By.xpath("//input[@id='equityid15510001']")).click();
		driver.findElement(By.xpath("//tr[@id='equityRow19339864']//input[@name='Transaction History']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();

	}

}
