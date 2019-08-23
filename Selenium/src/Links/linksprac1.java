package Links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksprac1 {

	public static void main(String[] args) {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.cardekho.com/?utm_campaign=SER-Brand&utm_device=c&utm_term=car%20dheko&network=g&utm_medium=cpc&utm_source=google&agid=15533130318&ap=1t1&aoi=&ci=152783838&cre=333428618581&fid=&lop=9040201&ma=e&mo=&pl=&ti=kwd-51404097166&gclid=CjwKCAjw1f_pBRAEEiwApp0JKOr_XjJ6UhGEXP0qms0Vz7DL02BwF0XVFbaDB2zwR2o750HfSQbp4BoCi5QQAvD_BwE");
	  List<WebElement> atags = driver.findElements(By.tagName("a"));
	  atags.addAll(driver.findElements(By.tagName("img")));
	  System.out.println(atags.size());
	  for(int i=0;i<=atags.size();i++) {
		 WebElement tagsize = atags.get(i);
		 String htmlreference =tagsize.getAttribute("href");
		verifyingalllinks(htmlreference);
		System.out.println(i+"::"+tagsize.getText()+"*****************"+ tagsize.isDisplayed());
	  }

	}

	private static void verifyingalllinks(String htmlreference) {
		try {
			URL url = new URL(htmlreference);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			http.setConnectTimeout(2000);
			http.connect();
			if(http.getResponseCode()==200) {
				System.out.println("VALID LINK::" +htmlreference +"--->"+http.getResponseMessage()+"--" +http.getResponseCode());
			}
			else
			{
				System.out.println("BROKEN LINK::"+htmlreference + http.getResponseMessage() +"***"+ http.getResponseCode() );
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	

}
}
