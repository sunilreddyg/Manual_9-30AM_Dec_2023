package junit;

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

class FacebookTests 
{
	static WebDriver driver;
	String url="http://facebook.com";
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(10000);
		driver.quit();
	}
	
	@BeforeEach
	void setUp() throws Exception 
	{
		driver.get(url);
	}

	@AfterEach
	void tearDown(TestInfo test) throws Exception 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\"+test.getDisplayName()+".png"));
	}

	@Test
	void CheckingSignuplink() 
	{
		driver.findElement(By.xpath("//a[@href='/reg/'][contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Signup title verified");
	}
	
	@Test
	void CheckingLoginlink() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Log in')]")).click();
		Assert.assertEquals("Log in to Facebook", driver.getTitle());
		System.out.println("Login title verified");
	}


}
