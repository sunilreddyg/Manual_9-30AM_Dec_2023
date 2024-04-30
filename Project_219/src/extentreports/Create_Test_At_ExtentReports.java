package extentreports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Create_Test_At_ExtentReports 
{

	public static void main(String[] args) 
	{
		//Create Html file at Selected Location
		String path="reports\\Report2.html";
		ExtentReports reporter=new ExtentReports(path, true);
		
		//Creating First Test
		ExtentTest test1=reporter.startTest("Tc001_Valid");
		
		
		reporter.endTest(test1);
		
		
		//Creating Second Test
		ExtentTest test2=reporter.startTest("Tc001_Valid");
		
		
		reporter.endTest(test2);
				
				
		//Save and Flush Data to File
		reporter.flush();

	}

}
