package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestlistener interface which implement TestNG listeners
public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully executed listeners pass code");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I Failed executed listeners pass code" +result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
