package bq.webdriver.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	WebDriver driver;
	public void setupbrowser(String url)
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	public void closebrowser()
	{
		driver.close();
	}

}
