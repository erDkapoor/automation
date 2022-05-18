package listeners;


import org.testng.ITestListener;
import org.testng.ITestResult;


public class NgTestListner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//super.onTestStart(result);
		//Status Status= com.aventstack.extentreports.Status.valueOf("Fail");

		System.out.println("Test Start");
		//System.out.println(result.getInstance());
		
		
		
	}


}
