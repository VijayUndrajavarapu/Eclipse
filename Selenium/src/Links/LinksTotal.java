package Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTotal {

	public static void main(String[] args)   {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cardekho.com/?utm_campaign=SER-Brand&utm_device=c&utm_term=car%20dheko&network=g&utm_medium=cpc&utm_source=google&agid=15533130318&ap=1t1&aoi=&ci=152783838&cre=333428618581&fid=&lop=9040201&ma=e&mo=&pl=&ti=kwd-51404097166&gclid=CjwKCAjw1f_pBRAEEiwApp0JKOr_XjJ6UhGEXP0qms0Vz7DL02BwF0XVFbaDB2zwR2o750HfSQbp4BoCi5QQAvD_BwE");
		List<WebElement> d=driver.findElements(By.tagName("a"));
		d.addAll(driver.findElements(By.tagName("img")));
		System.out.println(d.size());
		for(int i=0;i<d.size();i++) {
			WebElement w =d.get(i);
			String z = w.getAttribute("href");
			verifylinks(z);
		System.out.println(i+"***"+w.getText()+"*****************"+ w.isDisplayed());
		}
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		WebElement qw=d.get(164);
		System.out.println(qw.getText());
		System.out.println(qw.getLocation().x);
		System.out.println(qw.getLocation().y);
		qw.click();
		
		
	}

	private static void verifylinks(String z)  {
		try {
		URL u = new URL(z);
		HttpURLConnection http=  (HttpURLConnection)u.openConnection();
		http.setConnectTimeout(5000);
		http.connect();
		
			if(http.getResponseCode()==200) {
				System.out.println("VALID LINK:"+z+"::"+http.getResponseMessage()+"::"+http.getResponseCode());
			}
			else {
				  System.out.println("BROKEN LINK :"+z+" :: "+http.getResponseMessage()+" :: "+http.getResponseCode());

			  }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
