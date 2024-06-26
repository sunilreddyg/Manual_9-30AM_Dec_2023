package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.lang.reflect.Method;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Testng_WebDriver_TestCase 
{
	
	WebDriver driver;
	String url="http://facebook.com";
	
	
	@Test(priority=0)
	public void Verify_Signup_Footer_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		String Exp_title="Sign up for Facebook | Facebook";
		Assert.assertEquals(driver.getTitle(), Exp_title);
		Reporter.log("Signup Footer link loaded and Title Displayed --.>"+driver.getTitle());
	}
	
	@Test(priority=1,enabled=false)
	public void Verify_SignIn_Footer_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
		String Exp_title="Log in to Facebook";
		Assert.assertEquals(driver.getTitle(), Exp_title);
		Reporter.log("login Footer link loaded and Title Displayed --.>"+driver.getTitle());
	}
	
	@Test(priority=2)
	public void Verify_Messenger_Footer_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		String Exp_title="Messenger";
		Assert.assertEquals(driver.getTitle(), Exp_title);
		Reporter.log("Messenger Footer link loaded and Title Displayed --.>"+driver.getTitle());
	}
	
	
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get(url);  //Loadwebpage before execute @Test method
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  File src_file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(src_file, new File("screens\\"+method.getName()+".png"));
  }
  
  @AfterEach
  public void afterMethod(TestInfo info) throws Exception 
  {
	  File src_file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(src_file, new File("screens\\"+info.getDisplayName()+".png"));
  }

  @BeforeClass
  public void beforeClass() 
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws Exception
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
