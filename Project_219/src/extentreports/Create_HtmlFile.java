package extentreports;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_HtmlFile {

	public static void main(String[] args) 
	{
		//Create html file
		ExtentReports reporter=new ExtentReports("reports\\report1.html",true);

		reporter.flush();
	}

}
