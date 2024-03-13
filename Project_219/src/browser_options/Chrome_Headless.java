package browser_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Headless 
{

	public static void main(String[] args) 
	{
		//Setting chrome options to headless
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		System.out.println("facebook Page is Opened");
		
		System.out.println("page title is --->"+driver.getTitle());
	}

}
