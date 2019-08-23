package practice;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://news.google.com/?hl=en-IN&gl=IN&ceid=IN:en");
		List<WebElement> Z=driver.findElements(By.tagName("a"));					//for href links
		Z.addAll(driver.findElements(By.tagName("img")));							//for images
		System.out.println(Z.size());												//total size of links in a page
		for(int i=0;i<Z.size();i++) {												//FOR loop
			WebElement w=Z.get(i);													//z(index) is stored in w
			String s= w.getAttribute("href");										//w(href) is stored in s
			VerifyActiveLinks(s);													//for creating method	
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
		
	}

}
