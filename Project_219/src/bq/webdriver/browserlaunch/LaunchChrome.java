package bq.webdriver.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome 
{

	public static void main(String[] args) 
	{
		
		//Launch Chrome browser and storing into Webdriver reference class
		WebDriver driver=new ChromeDriver();
		
		//Using browser reference loading webpage
		driver.get("https://facebook.com");
		
		//Printing Current page title
		System.out.println(driver.getTitle());
		
		//Closing active browser window
		driver.close();

	}

}
