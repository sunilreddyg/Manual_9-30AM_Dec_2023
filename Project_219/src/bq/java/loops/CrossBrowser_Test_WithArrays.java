package bq.java.loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser_Test_WithArrays 
{

	public static void main(String[] args) 
	{
		
		
		String browsers[]= {"chrome","firefox"};
		WebDriver driver = null;
		
		//Outter Loop
		for (String Eachbrowser : browsers) 
		{
				if(Eachbrowser.equals("chrome"))
				{
					 driver=new ChromeDriver();
				}
				else if(Eachbrowser.equals("firefox"))
				{
					driver=new FirefoxDriver();
				}
				
				
				//Loading new page
				driver.get("https://facebook.com");
				driver.manage().window().maximize();
				
				String Footerlinks[][]= 
					{
							{"Sign Up","Sign up for Facebook | Facebook"},
							{"Log in","Log in to Facebook"},
							{"Messenger","Messenger"},
							{"Facebook Lite","Facebook Lite APK for Android"},
							{"Video","Facebook video | Facebook"},
							{"Places","Discover great places in every city | Facebook"},
							{"Games","Facebook"},
					};
		
				
				//InnerLoop
				for (int i = 0; i < Footerlinks.length; i++) 
				{
					String[] strings = Footerlinks[i];
					String linkname=strings[0];
					String pagetitle=strings[1];
					driver.findElement(By.linkText(linkname)).click();
					
					if(driver.getTitle().contains(pagetitle))
					{
						System.out.println("Testpass:--> Title Verified");
					}
					else
					{
						System.out.println("Testfail:--> Title Not Verified");
					}
					
					
					//Get back to main page
					driver.navigate().back();
					
				
				}
				
	
		}

	}

}
