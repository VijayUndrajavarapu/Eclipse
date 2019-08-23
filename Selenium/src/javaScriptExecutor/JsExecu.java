package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecu {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://mail.rediff.com/cgi-bin/login.cgi'");
		String state = (String)js.executeScript("return document.readyState");
		System.out.println(state);
		Thread.sleep(4000);
		
		js.executeScript("document.getElementById('login1').value='hello';");
		js.executeScript("window.scrollTo(0,200)");
		System.out.println("------");
		WebElement ww=driver.findElement(By.xpath("//*[@id=\"u_0_2\"]"));
		flash(ww,driver);
	}
	public static void flash(WebElement w,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String bgcolor = w.getCssValue("bagroundColor");
			for(int i=0;i<100;i++) {
				changeColor("rgb(0,200,0)",w,driver);
				changeColor(bgcolor,w,driver);
			}
	}
	public static void changeColor(String color, WebElement w, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.background ="+color+"'", w);
	try {
		Thread.sleep(20);
	}
	catch(InterruptedException e) {
	}
	}
}
