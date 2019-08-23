package Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinksOriginal {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com");
		List<WebElement>ataglinks= driver.findElements(By.tagName("a"));
		ataglinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println(ataglinks.size());
	
		for(int i=0;i<=ataglinks.size();i++) {
			WebElement GIndex=ataglinks.get(i);
			String hmtlref=GIndex.getAttribute("href");
			verifyLinks(hmtlref);
		}
		

	}

	private static void verifyLinks(String hmtlref) throws IOException {
		URL u = new URL(hmtlref);
		HttpURLConnection huc = (HttpURLConnection)u.openConnection();
		huc.connect();
		if (huc.getResponseCode() == 200) {
			System.out.println(hmtlref + "-" + huc.getResponseMessage());
		if (huc.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND);
		System.out.println(hmtlref + "-" + huc.getResponseMessage() + "-" + HttpURLConnection.HTTP_NOT_FOUND);		
		
	}

	}

	
		
	}

