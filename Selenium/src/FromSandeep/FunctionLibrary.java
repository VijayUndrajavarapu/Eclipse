package FromSandeep;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionLibrary {
	
	static boolean resultStatus= false;
	static WebDriverWait waittime;
	
	
	
	public static WebDriver openbrowser(WebDriver driver, String browserName){
		
		try {
			if(browserName.equalsIgnoreCase("CHROME") || browserName.equalsIgnoreCase("GOOGLECHROME") || browserName.equalsIgnoreCase("GOOGLE CHROME")){
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
				driver=new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("IE") || browserName.equalsIgnoreCase("INTERNETEXPLORER") || browserName.equalsIgnoreCase("INTERNET EXPLORER")){
				System.setProperty("webriver.ie.driver", System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}else{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\lib\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			resultStatus=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			String error_message=e.getMessage();
			resultStatus=false;
		}
		return driver;
	}
	
	
	public static boolean openApp(WebDriver driver, String url){
		
		try{
			driver.get(url);
			resultStatus=true;
		}catch(Exception e) {
			e.printStackTrace();
			String error_message=e.getMessage();
			resultStatus=false;
		}
		return resultStatus;
		
	}
	
	public static boolean click(WebDriver driver, String locatorType, String LocatorValue){
		try{
			WebElement clickableElement;
			driver.manage().timeouts().implicitlyWait(45000, TimeUnit.SECONDS);
			locatorType=locatorType.toLowerCase();
			switch (locatorType)
			{
			case "id":
				clickableElement=driver.findElement(By.id(LocatorValue));
				clickableElement.click();
				break;
				
			case "xpath":
				clickableElement=driver.findElement(By.xpath(LocatorValue));
				clickableElement.click();
				break;
				
			case "name":
				clickableElement=driver.findElement(By.name(LocatorValue));
				clickableElement.click();
				break;
				
			case "linktext":
				clickableElement=driver.findElement(By.linkText(LocatorValue));
				clickableElement.click();
				break;
				
			case "partiallinktext":
				clickableElement=driver.findElement(By.partialLinkText(LocatorValue));
				clickableElement.click();
				break;
				
			case "cssselector":
				clickableElement=driver.findElement(By.cssSelector(LocatorValue));
				clickableElement.click();
				break;
				
			}
			resultStatus=true;
			
		}catch(Exception e){
			e.printStackTrace();
			String error_message=e.getMessage();
			resultStatus=false;
		}
		return resultStatus;
	}
	
	public static boolean sendData(WebDriver driver, String locatorType, String LocatorValue, String testData){
		try{
			WebElement datafield;
			locatorType=locatorType.toLowerCase();
			//driver.manage().timeouts().implicitlyWait(45000, TimeUnit.SECONDS);
			Thread.sleep(1500);
			switch (locatorType)
			{
			case "id":
				datafield=driver.findElement(By.id(LocatorValue));
				datafield.sendKeys(testData);
				break;
				
			case "xpath":
				datafield=driver.findElement(By.xpath(LocatorValue));
				datafield.sendKeys(testData);
				break;
				
			case "name":
				datafield=driver.findElement(By.name(LocatorValue));
				datafield.sendKeys(testData);
				break;
				
			case "linktext":
				datafield=driver.findElement(By.linkText(LocatorValue));
				datafield.sendKeys(testData);
				break;
				
			case "partiallinktext":
				datafield=driver.findElement(By.partialLinkText(LocatorValue));
				datafield.sendKeys(testData);
				break;
				
			case "cssselector":
				datafield=driver.findElement(By.cssSelector(LocatorValue));
				datafield.sendKeys(testData);
				break;
			}
			resultStatus=true;
		}catch(Exception e){
			e.printStackTrace();
			String error_message=e.getMessage();
			resultStatus=false;
		}
		return resultStatus;
	}
	
	public static boolean waitForElement(WebDriver driver, String locatorType, String LocatorValue, String testData){
		
		try{
			WebElement datafield;
			locatorType=locatorType.toLowerCase();
			switch (locatorType)
			{
			case "id":
				datafield=driver.findElement(By.id(LocatorValue));
				datafield.isDisplayed();
				//datafield.sendKeys(testData);
				break;
				
			case "xpath":
				datafield=driver.findElement(By.xpath(LocatorValue));
				datafield.isDisplayed();
				//datafield.sendKeys(testData);
				break;
				
			case "name":
				datafield=driver.findElement(By.name(LocatorValue));
				datafield.isDisplayed();
				//datafield.sendKeys(testData);
				break;
				
			case "linktext":
				datafield=driver.findElement(By.linkText(LocatorValue));
				datafield.isDisplayed();
				//datafield.sendKeys(testData);
				break;
				
			case "partiallinktext":
				datafield=driver.findElement(By.partialLinkText(LocatorValue));
				datafield.isDisplayed();
				//datafield.sendKeys(testData);
				break;
				
			case "cssselector":
				datafield=driver.findElement(By.cssSelector(LocatorValue));
				datafield.isDisplayed();
				//datafield.sendKeys(testData);
				break;
			}
			resultStatus=true;
			
		}catch(Exception e){
			e.printStackTrace();
			String error_message=e.getMessage();
			resultStatus=false;
		}
		return resultStatus;
	}
	
	public static boolean waitTime(WebDriver driver, String testData){
		try{
			long waitingSeconds=Long.parseLong(testData);
			for(int i=0; i<5; i++){
				Thread.sleep(waitingSeconds);
			}
		}catch(Exception e){
			e.printStackTrace();
			String error_message=e.getMessage();
			resultStatus=false;
		}
		return resultStatus;
	}

}
