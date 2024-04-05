package findElements;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToCheck_Broken_links 
{
	
	public static void main(String[] args) 
	{
		String appurl="https://facebook.com";
		WebDriver driver = new ChromeDriver();
		driver.get(appurl);	
		driver.manage().window().maximize();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement webElement : links) 
		{
			
			String linkhref=webElement.getAttribute("href");
			//System.out.println(linkhref);
			
			if(linkhref == null || linkhref.isEmpty())
			{
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
				
			if(!linkhref.startsWith(appurl))
			{
			System.out.println("URL belongs to another domain, skipping it.");
			continue;
			}
		
			

			HttpURLConnection huc = null;
			int respCode = 200;
			
			try {
				
				huc = (HttpURLConnection)(new URL(linkhref).openConnection());
				
				huc.setRequestMethod("HEAD");
				
				huc.connect();
				
				respCode = huc.getResponseCode();
				
				if(respCode >= 400)
				{
					System.out.println(linkhref+" is a broken link");
				}
				else if(respCode==200)
				{
					System.out.println(linkhref+" is a valid link");
				}
				else
				{
					System.out.println(linkhref+" unknown "+respCode);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}

}
