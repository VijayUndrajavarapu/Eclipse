package Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks2 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://news.google.com/?hl=en-IN&gl=IN&ceid=IN:en");
		List<WebElement> atags =driver.findElements(By.tagName("a"));
		atags.add(driver.findElement(By.tagName("img")));
		System.out.println(atags.size());

		for(int i=0;i<=atags.size();i++) {
			WebElement w=atags.get(i);
			String html=w.getAttribute("href");
			verify(html);
			
		}
	}

	private static void verify(String html) throws IOException {
		URL u = new URL(html);
		HttpURLConnection http = (HttpURLConnection)u.openConnection();
		http.connect();
		if(http.getResponseCode()==200) {
			System.out.println(http.getResponseMessage()+"--->"+html);
		}else {
			System.out.println(http.getResponseMessage()+"---->"+html);
		}
		
	}

}
