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
				try {
					driver.findElement(By.id("email")).sendKeys("Admin");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			else
				System.out.println("Title mismatch");
			
			
		}

	}

}
