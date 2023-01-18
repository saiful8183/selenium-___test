package parallalTest;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listener implements ITestListener{

		@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);

	System.out.println("Capture screenshot " + result.getName());



	}

	
	
}
