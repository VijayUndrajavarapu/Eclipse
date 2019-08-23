package Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks1 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		tags.add(driver.findElement(By.tagName("img")));
		System.out.println(tags.size());
		for(int i=0;i<=tags.size();i++) {
			WebElement w = tags.get(i);
			String Q=w.getAttribute("href");
			verify(Q);
		}

	}

	private static void verify(String q) throws IOException {
		URL u = new URL(q);
		HttpURLConnection katraj = (HttpURLConnection) u.openConnection();
		katraj.connect();
		if(katraj.getResponseCode()==200) {
			System.out.println(katraj.getResponseMessage()+"--->"+q);
		}
		if(katraj.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
			System.out.println(katraj.getResponseMessage()+"--->"+q);
		}
		
	}

}
