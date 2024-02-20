package bq.webdriver.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		
		
		//Launch Firefox browser
		WebDriver driver=new FirefoxDriver();

		//Loading webpage using webdriver reference
		driver.get("http://facebook.com");
		
		//Printing Current page title
		System.out.println(driver.getTitle());
		
		//Closing active browser window
		driver.close();

	}

}
