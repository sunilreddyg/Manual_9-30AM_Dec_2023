package bq.webdriver.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_interface 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		//Launching chrome browser  and storing into webdriver reference
		WebDriver driver=new ChromeDriver();
		
		//loading webpage
		driver.get("http:/facebook.com");
		
		//Print current browser title
		System.out.println(driver.getTitle());
		
		driver.close();  //Close browser window
		
		/*
		 * WebDriver:--> 
		 * 			WebDriver is a interface class it is implemented
		 * 			all browser instances support by Selenium.
		 * 
		 * 			WebDriver methods are usefull to automate
		 * 			different browsers like [Chrome,Safari,Opera ---etc]
		 */
	
		/*
		 * Exceptions:-->
		 * 
		 * 		IllegalStateException:-->
		 * 			=> This exception we receive when don't define
		 * 				environment path for browser drivers
		 * 							[OR]
		 * 
		 * 		=> When we define wrong path  or Spell Mistakes
		 * 
		 * 		SessionNotCreateException:-->
		 * 			=> When your browser driver and browser version
		 * 				is mismatched
		 * 
		 * 		
		 * 		InvalidArgumentException:-->
		 * 				=> When url format is mimstached
		 * 				=> Url should start with http://  or https://
		 */
		

		
		
		
	}

}
