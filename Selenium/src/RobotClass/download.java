package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class download {

	public static void main(String[] args) throws AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a")).click();
		//Robot r = new Robot();
		
		//r.keyPress(KeyEvent.VK_ENTER);
		

	}

}
