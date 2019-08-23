package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks1 {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/1/#inbox");
		List<WebElement> TL = driver.findElements(By.tagName("a"));
		TL.addAll(driver.findElements(By.tagName("img")));
		System.out.println(TL.size());
		for(int i=0;i<TL.size();i++) {
			WebElement w=TL.get(i);
			String g=w.getAttribute("href");
			verifyActiveLinks(g);
			
		}
	}

	private static void verifyActiveLinks(String g) throws IOException {
		URL u = new URL(g);
		HttpURLConnection huc = (HttpURLConnection) u.openConnection();
		huc.connect();
		if(huc.getResponseCode()==200) {
			System.out.println(huc.getResponseMessage()+g);
			if(huc.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(huc.getResponseMessage());
			}
		}
		
		
		
	}
	
}
