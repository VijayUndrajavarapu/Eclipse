package TestNG;

import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class testngG_original {
	@BeforeMethod
	public void Biryani() {
		System.out.println("hands wash");
	}

	@Test(priority = 3)
	public void chicken() {
		int i = 5 / 0;
		System.out.println("third test case");
	}

	@Test(priority = 1)
	public void mutton() {
		System.out.println("first test case");
	}

	@Test(dependsOnMethods = "chicken")
	public void prawns() {
		System.out.println("foourth test caase");
	}

	@Test(priority = 2)
	public void fish() {
		System.out.println("Second test case!");
	}

	@AfterMethod
	public void handswash() {
		System.out.println("Hands wash!!!");
	}

	public void afterInvocation(IInvokedMethod method, ITestResult result) { // to report the failures- IInvokedMethod
		Reporter.setCurrentTestResult(result);

		if (method.isTestMethod()) {
			List<Throwable> verificationFailures = ErrorUtil.getVerificationFailures();
			// if there are verification failures...
			if (verificationFailures.size() != 0) {
				// set the test to failed
				result.setStatus(ITestResult.FAILURE);

				// if there is an assertion failure add it to verificationFailures
				if (result.getThrowable() != null) {
					verificationFailures.add(result.getThrowable());
				}

				int size = verificationFailures.size();
				// if there's only one failure just set that
				if (size == 1) {
					result.setThrowable(verificationFailures.get(0));
				} else {
					// create a failure message with all failures and stack traces (except last
					// failure)
					StringBuffer failureMessage = new StringBuffer("Multiple failures (").append(size).append("):nn");
					for (int i = 0; i < size - 1; i++) {
						failureMessage.append("Failure ").append(i + 1).append(" of ").append(size).append(":n");
						Throwable t = verificationFailures.get(i);
						String fullStackTrace = Utils.stackTrace(t, false)[1];
						failureMessage.append(fullStackTrace).append("nn");
					}

					// final failure
					Throwable last = verificationFailures.get(size - 1);
					failureMessage.append("Failure ").append(size).append(" of ").append(size).append(":n");
					failureMessage.append(last.toString());

					// set merged throwable
					Throwable merged = new Throwable(failureMessage.toString());
					merged.setStackTrace(last.getStackTrace());

					result.setThrowable(merged);

				}
			}

		}

	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
	}

	public class retryAnalyzer implements IRetryAnalyzer{

		
		int counter = 0;
		int retryLimit = 3;
		public boolean retry(ITestResult result){
			if(counter < retryLimit){
				counter++;
				return true;
			}
			return false;
		}

	}
}
