package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Firefox
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Download geckodriver.exe file
		 * 	   https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html
		 * 		=> Under supported platfroms findout required geckodriver
		 * 					version w.r.t firefox browser and selenium version
		 * 		=> click on geckodriver releases link
		 * 		=> Under asserts download zip format file w.r.t operating
		 * 				system and hotspot size
		 * 		=> 
		 */
		
		//Setting runtime environment variable for geckodriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		
		//launching firefox browser and storing into reference class
		WebDriver firefox=new FirefoxDriver();
		
		//Load webpage to browser window
		firefox.get("http://google.com");
		
		//print title of the page
		System.out.println(firefox.getTitle());
		
		
		//Close firefox
		firefox.close();
		
	}

}
