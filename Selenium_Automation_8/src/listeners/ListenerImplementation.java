package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation implements ITestListener{

	
	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();// it will return current @Test running method name
		String time = LocalDateTime.now().toString().replace(":", "-");
		Reporter.log("TestScript is failed",true);
		TakesScreenshot ts=(TakesScreenshot) BaseClass.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./screenshots/"+methodName+time+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TestScript is skipped",true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TestScript is passed",true);
	}


}
