package Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks3 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> tags=driver.findElements(By.tagName("a"));
		tags.addAll(driver.findElements(By.tagName("img")));
		System.out.println(tags.size());
		
		for(int j=0;j<=tags.size();j++) {
			WebElement e = tags.get(j);
			String html = e.getAttribute("href");
			verify(html);
			
		}

	}

	private static void verify(String html) throws IOException {
		URL u = new URL(html);
		HttpURLConnection huc = (HttpURLConnection) u.openConnection();
		huc.connect();
		if(huc.getResponseCode()==200) {
			System.out.println(huc.getResponseMessage()+"---->"+html);
		}if (huc.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
			System.out.println(huc.getResponseMessage()+"---->"+html);
		}
		
	}

}
