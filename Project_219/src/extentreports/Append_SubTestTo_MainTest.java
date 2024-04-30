package extentreports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Append_SubTestTo_MainTest {

	public static void main(String[] args) {
		
		
		//Create Html file at Selected Location
		String path="reports\\Report3.html";
		ExtentReports reporter=new ExtentReports(path, true);
		
		
			
			//Creating First Test
			ExtentTest test1=reporter.startTest("Tc001_Valid");
			
			reporter.endTest(test1);
			
		
			//Creating Second Test
			ExtentTest test2=reporter.startTest("Tc001_Valid");
			
			reporter.endTest(test2);
			
			
			//Parent Test
			ExtentTest login=reporter.startTest("AdminLogin").assignAuthor("sunil");
			login.appendChild(test1).appendChild(test2);
			reporter.endTest(login);
				
		//Save and Flush Data to File
		reporter.flush();


	}

}
