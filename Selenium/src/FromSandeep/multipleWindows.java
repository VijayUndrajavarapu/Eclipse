package FromSandeep;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "*****Path of the gecko driver***********");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		driver.get("******URL**********");
		
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String> multipleWindows= driver.getWindowHandles();
		Iterator<String> iterator=multipleWindows.iterator();
		
		while(iterator.hasNext())
		{
			String childWindow=iterator.next();
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				/*
				 * 
				 * 
				 * **************script to perform actions on the child window********************
				 * 
				 * 
				 * */
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
	}

}
