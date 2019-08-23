package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLInks2 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://edition.cnn.com/");
		List<WebElement> x=driver.findElements(By.tagName("a"));
		x.addAll(driver.findElements(By.tagName("img")));
		System.out.println(x.size());
		
		for(int i=0;i<=x.size();i++) {
			WebElement y=x.get(i);
			String z=y.getAttribute("href");
			verifyActiveLinks(z);
			
		}

	}

	private static void verifyActiveLinks(String z) throws IOException {
		URL u=new URL(z);
		HttpURLConnection huc = (HttpURLConnection)u.openConnection();
		huc.connect();

		if (huc.getResponseCode() == 200) {
			System.out.println(z + "-" + huc.getResponseMessage());
		if (huc.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND);
		System.out.println(z + "-" + huc.getResponseMessage() + "-" + HttpURLConnection.HTTP_NOT_FOUND);		
		
	}

}
}

