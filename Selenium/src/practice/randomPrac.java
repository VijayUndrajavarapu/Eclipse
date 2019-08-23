package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class randomPrac {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*driver.get("https://tutorialehtml.com/en/html-tutorial-radio-buttons/");
		List<WebElement> allradios=driver.findElements(By.name("citizenship"));
        System.out.println("Total radio buttons are " + allradios.size());
        allradios.get(1).click();
        
        System.out.println(allradios.get(0).getAttribute("selected"));
        System.out.println(allradios.get(1).getAttribute("selected"));
        System.out.println(allradios.get(2).getAttribute("selected"));*/
        
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement w = driver.findElement(By.id("vfb-7-2"));
		w.click();
		System.out.println(w.getAttribute("selected"));
		
	}


	}



		/*driver.get("https://www.voot.com/movie/go-goa-gone/379603");
		driver.findElement(By.xpath("//*[@id=\"voot-app\"]/div/div/div/div[2]/div/div/div[1]/div/div/div/button")).click();;
		driver.findElement(By.xpath("//*[@id=\"interfacecontainer\"]/a[2]/div/span[2]")).click();
		
		Set<String> ref = driver.getWindowHandles();
		Iterator<String> I = ref.iterator();
		
		String parentwind = I.next();
		System.out.println(parentwind);
		
		String childwindowId = I.next();
		System.out.println(childwindowId);
		
		driver.switchTo().window(childwindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/span/span")).click();
		driver.findElement(By.name("firstName")).sendKeys("jambalhut");
		driver.findElement(By.name("lastName")).sendKeys("ranii");
		driver.findElement(By.id("username")).sendKeys("janjigidi");
		driver.findElement(By.name("Passwd")).sendKeys("qwerasdf");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("qwerasdf");
		WebElement eye = driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/div[3]/div[2]/div"));
		
		Actions act = new Actions(driver);
		act.moveToElement(eye).click().build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[2]/div[2]/div")).click();
		driver.findElement(By.name("identifier")).clear();
		driver.switchTo().window(parentwind);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(childwindowId);
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		System.out.println("**************************************************************************************************");
		
		List<WebElement> Z=driver.findElements(By.tagName("a"));					
		Z.addAll(driver.findElements(By.tagName("img")));							
		System.out.println(Z.size());												
		for(int i=0;i<Z.size();i++) {												
			WebElement w=Z.get(i);													
			String s= w.getAttribute("href");										
			VerifyActiveLinks(s);													
		}
		
	}
	private static void VerifyActiveLinks(String s) throws IOException {
		URL u= new URL(s);
		HttpURLConnection huc = (HttpURLConnection) u.openConnection();
		huc.connect();
			if(huc.getResponseCode()==200) {
				System.out.println(huc.getResponseMessage()+ "*******" + s);
				if(huc.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
					System.out.println(huc.getResponseMessage()+"*****"+ s);
				}
			}
	System.out.println("*********************************************************************************");*/
	
	