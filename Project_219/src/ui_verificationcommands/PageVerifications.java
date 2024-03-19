package ui_verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageVerifications 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		//Get current window page titlte
		String PageTitle=driver.getTitle();
		System.out.println("Current Page Title is --> "+PageTitle);
		
		
		//Get Current Window Url
		String Pageurl=driver.getCurrentUrl();
		System.out.println("Current Page Url is --->"+Pageurl);
		
		
		//Get Current Window Dynamic ID
		String WIndowID=driver.getWindowHandle();
		System.out.println("Window ID is --> "+WIndowID);
		
		//Get pagesource
		String Pagesource=driver.getPageSource();
		System.out.println(Pagesource);
		
		
	}

}
