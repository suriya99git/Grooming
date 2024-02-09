package TestngListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("test exceution failed",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test case Started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Testcase Finish",true);
	}

	
	
}
