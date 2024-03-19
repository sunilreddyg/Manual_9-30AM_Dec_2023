package ui_verificationcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Presented_At_PageSource {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		try {
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println("Browser is UP");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} 
		
		if(driver!=null)
		{
			
				try {
					driver.get("https://facebook.com");
					System.out.println("Page load successfull");
				} catch (SessionNotCreatedException e) {
					e.printStackTrace();
					System.out.println("Browser version is mismatched");
				} catch (InvalidArgumentException e) {
					e.printStackTrace();
					System.out.println("invalid url format");
				}
				
				
				//Using Condition Verify Element Presented at source
				String PageSource=driver.getPageSource();
				if(PageSource.contains("email"))
				{
					driver.findElement(By.id("email")).sendKeys("Admin");
				}
				else
				{
					System.out.println("Element Not presented at source");
				}
				
				
				//Using Trycatch verifying element presented at soruce
				try {
					driver.findElement(By.id("pass")).sendKeys("Admin");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
		}
		else
		{
			System.out.println("Browser launch Failed");
		}
		

	}

}
