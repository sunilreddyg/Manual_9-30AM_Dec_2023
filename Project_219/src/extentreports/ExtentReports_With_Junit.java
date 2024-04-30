package extentreports;

import java.io.File;
import java.time.Duration;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

class ExtentReports_With_Junit 
{
	static ExtentReports reporter;
	static WebDriver driver;
	static String path="reports\\Report6.html";
	ExtentTest test;
	String url="http://facebook.com";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		//Create Html file at Selected Location
		reporter=new ExtentReports(path, true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.quit();
		reporter.flush();
		
	}

	@BeforeEach
	void setUp(TestInfo info) throws Exception 
	{
		test=reporter.startTest(info.getDisplayName());
		driver.get(url);
		test.log(LogStatus.INFO, "Page load finished");
	}

	@AfterEach
	void tearDown(TestInfo info) throws Exception 
	{
		Thread.sleep(5000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\"+info.getDisplayName()+".png"));
		test.log(LogStatus.INFO, test.addScreenCapture("D:\\06_Feb_2024_930AM\\Project_219\\screens\\"+info.getDisplayName()+".png"));
		reporter.endTest(test);
	}

	@Test
	void CheckingSignuplink() 
	{
		driver.findElement(By.xpath("//a[@href='/reg/'][contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		test.log(LogStatus.PASS, "Sigup title verifed");
	}
	
}
