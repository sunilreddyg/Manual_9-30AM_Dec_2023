package pageobjects.withoutpagefactory;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class RunFBTests 
{
	WebDriver driver;
	String url="http://facebook.com";
	FBTestcases testcases;
	public RunFBTests() 
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		testcases=new FBTestcases(driver);
	}

	@Test
	void test() 
	{
		testcases.tc001_userregistration();
	}

}
