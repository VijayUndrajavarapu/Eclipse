package ActionClass;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	//selenium locatorys---by.id,by.name,by.xpath,by.tagname
	public class dragondropBYoriginal {
		public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://jqueryui.com/draggable/");
			int s= driver.findElements(By.tagName("iframe ")).size();
			System.out.println("Total frames " + s);
			driver.switchTo().frame(0);
			WebElement e=driver.findElement(By.id("draggable"));
			Actions act = new Actions(driver);
			act.dragAndDropBy(e, 100, 100).build().perform();
			
			
			
			
		}

}
