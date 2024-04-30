package extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports_With_WebDriver {

	public static void main(String[] args) {
		
		
		//Create Html file at Selected Location
		String path="reports\\Report5.html";
		ExtentReports reporter=new ExtentReports(path, true);
		
		
			
			//Creating First Test
			ExtentTest test1=null;
			test1=reporter.startTest("Tc001_Valid");
			
					WebDriver driver=null;
					driver=new ChromeDriver();
					if(driver!=null)
					{
						test1.log(LogStatus.PASS, "Browser is Opened");
					}
					
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					if(driver.getTitle().equals("OrangeHRM"))
						test1.log(LogStatus.PASS, "Pageload successful");
					else
						test1.log(LogStatus.FAIL, "Pageload failed");
					
				
					test1.log(LogStatus.INFO, "Login details entered");
					test1.log(LogStatus.PASS, "Login Successful");
			reporter.endTest(test1);
			
			
		//Save and Flush Data to File
		reporter.flush();


	}

}
