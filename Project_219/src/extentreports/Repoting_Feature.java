package extentreports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Repoting_Feature {

	public static void main(String[] args) {
		
		//Create Html file at Selected Location
			String path="reports\\Report4.html";
			ExtentReports reporter=new ExtentReports(path, true);
			
			
				
				//Creating First Test
				ExtentTest test1=reporter.startTest("Tc001_Valid");
						test1.log(LogStatus.INFO, "Test initiated");
						test1.log(LogStatus.INFO, "Browser is Opened");
						test1.log(LogStatus.INFO, "Pageload successful");
						test1.log(LogStatus.INFO, "Login details entered");
						test1.log(LogStatus.PASS, "Login Successful");
						test1.log(LogStatus.FAIL, "Failed to logout session");
				reporter.endTest(test1);
				
				
			//Save and Flush Data to File
			reporter.flush();


	}

}
