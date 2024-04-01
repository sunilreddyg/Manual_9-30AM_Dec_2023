package bq.java.loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForLoop_WebDriver_Example 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
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
							{"Marketplace","Facebook Marketplace"},
					};
		
		
		for (int i = 0; i < Footerlinks.length; i++)
		{
			String[] eachrow = Footerlinks[i];
			String linkname=eachrow[0];
			String linktitle=eachrow[1];
			
			driver.findElement(By.linkText(linkname)).click();
			Thread.sleep(2000);
			
			if(driver.getTitle().contains(linktitle))
				System.out.println("Tespass:--> "+linkname+"  --"+linktitle);
			else
				System.out.println("Testfail:--> "+linkname+"  --"+linktitle);
			
			
			//Navigate to Back
			driver.navigate().back();
		}
		

	}

}
