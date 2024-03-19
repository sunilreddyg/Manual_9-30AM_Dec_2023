package bq.java.Exception_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongElement 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
			System.out.println("Browser is Opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(driver!=null)
		{
			try {
				driver.get("http://facebook.com");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(driver.getTitle().contains("Facebook"))
			{
				System.out.println("Page Verified");
				try {
					driver.findElement(By.id("email")).sendKeys("Darshan");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("page not verified");
			}
			
		}
		else
		{
			System.out.println("browser intitation failed");
		}
		
		

	}

}
