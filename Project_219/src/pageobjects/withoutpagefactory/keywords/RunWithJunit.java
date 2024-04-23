package pageobjects.withoutpagefactory.keywords;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class RunWithJunit 
{
	WebDriver driver;
	String url="http://facebook.com";
	
	public RunWithJunit() 
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	void test() 
	{
		TestcasewithKeywords test=new TestcasewithKeywords(driver);
		test.VerifySignupWithValidData();
	}
	
	

}
