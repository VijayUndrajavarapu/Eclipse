package ActionClass;

	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class ScrollingOriginal {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://edition.cnn.com/");
			Actions act = new Actions(driver);
			//Scroll down
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(3000);
			//scroll up
			act.sendKeys(Keys.PAGE_UP).build().perform();
		
		//driver.close();	
		}
			

}
