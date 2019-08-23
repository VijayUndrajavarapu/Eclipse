package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng1 {

	@BeforeSuite
	public void suiteB() {
		System.out.println("beforesuite");
	}
	@BeforeTest
	public void testb() {
		System.out.println("before test");
	}
	@BeforeClass
	public void classb() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void methodb() {
		System.out.println("before method");
	}
	@Test(priority=2)
	public void testba() {
		System.out.println("printing the first one as first priority");
	}
	@Test(priority=1)
	public void testesd() {
		System.out.println("printing the second one as second priority");
	}
	@AfterMethod
	public void methoda() {
		System.out.println("after method");
	}
	@AfterClass
	public void classa() {
		System.out.println("after class");
	}
	@AfterTest
	public void testa() {
		System.out.println("after test");
	}
	@AfterSuite
	public void suitea() {
		System.out.println("after suite");
	}
}
