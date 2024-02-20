package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{

	public static void main(String[] args) 
	{
	
		/*
		 * Download chromedriver.exe file
		 * 
		 * 		=>https://chromedriver.chromium.org/downloads
		 * 		=> Check what version of chrome browser is installed
		 * 				Open ChromeBrowser --> click on settings
		 * 				---> Help Menu----> About google chrome
		 * 		=> Click on chromedriver version w.r.t chrome browser versino
		 * 		=> Select required operating system and click  on download
		 * 		=> After download unzip file to backup location
		 * 		=> After unzip you receive chromedriver.exe file then set up
		 * 			environment variable for chromedriver.exe file..
		 * 
		 */
		
		
		//Setting Runtime environment variable for chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
	
		//Opening Chrome browser and storing into reference.
		WebDriver driver=new ChromeDriver();

		//using chromedriver reference loading webpage
		driver.get("http://facebook.com");
		
		//Printing Current window title
		System.out.println(driver.getTitle());
		
		//Close Browser window
		driver.close();
	}

}
