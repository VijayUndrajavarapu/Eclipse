package ActionClass;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.interactions.Actions;

	public class dragAndDropOriginal {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/demos/droppable/");
		int s =driver.findElements(By.tagName("iframe ")).size();
		System.out.println("total frames" + s);
		driver.switchTo().frame(0);
		
		WebElement src =driver.findElement(By.id("draggable"));
		WebElement dest =driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
		
		driver.close();
	}

}
